import {BrowserRouter} from 'react-router-dom';
import NavigationHeader from './Components/header';
import Routes from './routes';
import Footer from './Components/footer';
import './Styles/contato.css';
import './Styles/indexRecodeTourism.css';
import './Styles/header.css';
import './Styles/footer.css';
import './Styles/viagens.css';
import './Styles/promocoes.css';

function App() {
  return (   
    <BrowserRouter>
      <NavigationHeader />
      <Routes />
      <Footer />
    </BrowserRouter>
  );
}

export default App;
