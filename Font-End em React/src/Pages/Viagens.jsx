import rj1 from '../Assets/Catalogo/RJ/paquetá-pousada-rj.svg';
import rj2 from '../Assets/Catalogo/RJ/ilha-grande-pousada.svg';
import sp1 from '../Assets/Catalogo/SP/pousada-caraguatatuba-SP.svg';
import sp2 from '../Assets/Catalogo/SP/pousada-higienopolis-SP.svg';
import sp3 from '../Assets/Catalogo/SP/pousada-vila-olimpia-SP.svg';
import ba from '../Assets/Catalogo/BA/pousada-ilheus-BA.svg';
import mg from '../Assets/Catalogo/MG/pousada-pocos-de-caldas-MG.svg';

export default function Viagens() {
    return (
        <>
            <div id="title-header">
                <h2>
                    Somente aqui na Recode Pro Viagens você encontra o melhor destino que um
                    programador pode querer visitar!
                </h2>
                    <br />
                    <hr />
            </div>

            <section className="main">      
                <div className="container-viagens">
                    <div className="menu-lateral">
                        <ul className="list-group">
                            <li className="list-group-item d-flex justify-content-between align-items-center" onclick="exibir_todos('trip')">
                                Exibir todas as viagens
                                <span className="badge badge-primary badge-pill">7</span>
                            </li>
                
                            <li className="list-group-item d-flex justify-content-between align-items-center" onclick="exibir_categoria('trip-rj')">
                                Rio de Janeiro
                                <span className="badge badge-primary badge-pill">2</span>
                            </li>

                            <li className="list-group-item d-flex justify-content-between align-items-center" onclick="exibir_categoria('trip-sp')">
                                São Paulo
                                <span className="badge badge-primary badge-pill">3</span>
                            </li>
            
                            <li className="list-group-item d-flex justify-content-between align-items-center" onclick="exibir_categoria('trip-mg')">
                                Minas Gerais
                                <span className="badge badge-primary badge-pill">1</span>
                            </li>
            
                            <li className="list-group-item d-flex justify-content-between align-items-center" onclick="exibir_categoria('trip-ba')">
                                Bahia
                                <span className="badge badge-primary badge-pill">1</span>
                            </li>
                        </ul>
                    </div>
                </div>

                <div className="trip-options">
                    <div className="trip" id="trip-rj">
                        <img
                            src={rj1}
                            alt="Paquetá - RJ"
                        />
                        <p className="trip-name">Paquetá - RJ</p>
                        <p>Preços a partir de R$ 500</p>
                    </div>
                    
                    <div className="trip" id="trip-rj">
                        <img
                            src={rj2}
                            alt="Ilha Grande-RJ"
                        />
                        <p className="trip-name">Ilha Grande - RJ</p>
                        <p>Preços a partir de R$ 300</p>
                    </div>
                    
                    <div className="trip" id="trip-sp">
                        <img
                            src={sp1}
                            alt="Caraguatatuba-SP"
                        />
                        <p className="trip-name">Caraguatatuba - SP</p>
                        <p>Preços a partir de R$ 200</p>
                    </div>
                    
                    <div className="trip" id="trip-sp">
                        <img
                            src={sp2}
                            alt="Higienópolis-SP"
                        />
                        <p className="trip-name">Higienópolis - SP</p>
                        <p>Preços a partir de R$ 800</p>
                    </div>
                    
                    <div className="trip" id="trip-sp">
                        <img
                            src={sp3}
                            alt="Vila Olímpia-SP"
                        />
                        <p className="trip-name">Vila Olímpia - SP</p>
                        <p>Preços a partir de R$ 500</p>
                    </div>
                    
                    <div className="trip" id="trip-ba">
                        <img src={ba} />
                        <p className="trip-name">Ilhéus - BA</p>
                        <p>Preços a partir de R$ 250</p>
                    </div>
                    
                    <div className="trip" id="trip-mg">
                        <img
                            src={mg}
                            alt="Poços de Caldas-MG"
                        />
                        <p className="trip-name">Poços de Caldas - MG</p>
                        <p>Preços a partir de R$ 500</p>
                    </div>
                </div>
            </section>
        </>
    )
}