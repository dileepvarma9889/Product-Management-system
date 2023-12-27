
import { Route, Routes } from 'react-router-dom';
import './App.css';
import Navbar from './Component/Navbar';
import Home from './Component/Home';
import AddProduct from './Component/AddProduct';
import EditProduct from './Component/EditProduct';

function App() {
  return (
    <>
   <Navbar/>
   <Routes>
    <Route path='/' element={<Home/>}></Route>
    <Route path='/addProduct' element={<AddProduct/>}></Route>
    <Route path='/editProduct/:id' element={<EditProduct/>}></Route>
   </Routes>
   </>
  );
}

export default App;
