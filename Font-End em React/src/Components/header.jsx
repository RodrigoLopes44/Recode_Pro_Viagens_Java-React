import React from 'react';
import headerSVG from '../Assets/Logos/Recode Tourism.svg';
import { Link } from 'react-router-dom';

export default function NavigationHeader() {
    return(
    <header>
        <nav className="navbar navbar-expand-sm navbar-light">
        <img src={headerSVG} alt="Logo Recode Tourism" />            
        <button
            className="navbar-toggler d-lg-none"
            type="button"
            data-toggle="collapse"
            data-target="#collapsibleNavId"
            aria-controls="collapsibleNavId"
            aria-expanded="false"
            aria-label="Toggle navigation"
        >
            <span className="navbar-toggler-icon"></span>
        </button>
        
        <div className="collapse navbar-collapse" id="collapsibleNavId">
            <ul className="navbar-nav mr-auto mt-2 mt-lg-0">
                <li className="nav-item active">
                    <Link className="nav-link active" to='/'>Home<span /></Link>                        
                </li>
            
                <li className="nav-item">
                    <Link className="nav-link active" to='/Viagens'>Viagens<span /></Link>
                </li>
            
                <li className="nav-item">
                    <Link className="nav-link active" to='/Promocoes'>Promoções<span /></Link>                    
                </li>
          
                <li className="nav-item">
                    <Link className="nav-link active" to='/Contato'>Contato<span /></Link>                    
                </li>
        </ul>
        <form className="form-inline my-2 my-lg-0">
          <input
            className="form-control mr-sm-2"
            type="text"
            placeholder="Não encontrou algo?"
          />
          <button
            className="btn btn-success my-2 my-sm-0"
            type="submit"
            id="submit-search"            
          >
            Procurar
          </button>
        </form>
      </div>
    </nav>
    </header>
    );
}