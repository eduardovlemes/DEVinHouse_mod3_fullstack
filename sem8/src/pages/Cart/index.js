import { useContext } from 'react'
import { FaMinusCircle, FaPlusCircle, FaTrashAlt } from 'react-icons/fa'
import Swal from 'sweetalert2'

import { CartContext } from '../../contexts/CartContext'
import { priceFormat } from '../../utils/priceFormat'

const Cart = () => {
  const { cart, removeItem, changeAmount } = useContext(CartContext)

  const total = priceFormat(cart.reduce((acc, currentItem) => {
    return acc + currentItem.subTotal
  }, 0))

  const handleDeleteItem = (itemId) => {
    Swal.fire({
      title: 'Deseja realmente remover esse item ?',
      showCancelButton: true,
      confirmButtonText: 'Sim, desejo !',
      cancelButtonText: `Cancelar`,
    }).then((result) => {
      if (result.isConfirmed) {
        removeItem(itemId)
      }
    })
  }

  return (
    <>
      <div className='main-container'>
        <table className='table-cart' data-testid="table-cart">
          <thead>
            <tr>
              <th>#</th>
              <th>Produto</th>
              <th>Unidade</th>
              <th>Quantidade</th>
              <th>SubTotal</th>
              <th>Ações</th>
            </tr>
          </thead>
          <tbody>
            {cart.map(item => (
              <tr key={item.itemId}>
                <td>
                  <img className='table-image' src={item.product.image} alt={item.product.name} />
                </td>
                <td>{item.product.name}</td>
                <td>{item.priceWithDiscountFormatted}</td>
                <td>
                  <FaMinusCircle
                    size={18}
                    color="#9721BD"
                    className='margin-button'
                    onClick={() => changeAmount(item.itemId, item.amount - 1)}
                  />
                  {item.amount}
                  <FaPlusCircle
                    size={18}
                    color="#9721BD"
                    className='margin-button'
                    onClick={() => changeAmount(item.itemId, item.amount + 1)}
                  />
                </td>
                <td>{item.subTotalFormatted}</td>
                <td>
                  <FaTrashAlt size={22} color='#9721BD' onClick={() => handleDeleteItem(item.itemId)}/>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
        <div className='footer-cart'>
          <h1>Total: {total}</h1>
          <button>Continuar compra</button>
        </div>
      </div>
    </>
  )
}

export default Cart
