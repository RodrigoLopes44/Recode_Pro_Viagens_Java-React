import React from "react";
import { Routes, Route } from "react-router-dom";

import Home from './Pages/Home';
import Viagens from'./Pages/Viagens';
import Promocoes from "./Pages/Promocoes";
import Contato from './Pages/Contato';

export default function MainRoutes(){
    return(
        <Routes>
            <Route path='/' element={<Home/>} />
            <Route path='/Viagens' element={<Viagens/>} />
            <Route path='/Promocoes' element={<Promocoes/>} />
            <Route path='/Contato' element={<Contato/>} />
        </Routes>
    )
}