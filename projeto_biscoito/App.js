import React, { Component } from 'react';
import { 
  Text, 
  View, 
  StyleSheet, 
  TouchableOpacity,
  Image
} from 'react-native';

class App extends Component{
  constructor(props){
    super(props);
    this.state = {
      textoFrase:'',
      img: require('../projeto_biscoito/assets/Biscoito.PNG')
    };

    this.quebrarBiscoito = this.quebrarBiscoito.bind(this);

    this.frases = [
      "Grandes oportunidades surgem para quem está preparado.",
      "A paciência é a chave para abrir todas as portas.",
      "Um pequeno passo hoje pode levar a um grande destino amanhã.",
      "Seja a mudança que você deseja ver no mundo.",
      "A sorte favorece aqueles que nunca desistem.",
      "Siga seu coração, mas leve seu cérebro junto.",
      "Cada desafio é uma chance de crescer e evoluir."
    ]
  }

    quebrarBiscoito(){
      let numeroAleatorio = Math.floor(Math.random() * this.frases.length );
      
      this.setState({
        textoFrase: ' "' + this.frases[numeroAleatorio] + '" ',
        img: require('./assets/Biscoito_quebrado.PNG')
      })
    }

  render(){
    return(
      <View style={styles.container}>

      <image
        source={this.state.img}
        style={styles.img}
      />

      <Text style={styles.texto}>{this.state.textoFrase}</Text>

      <TouchableOpacity style={styles.botao} onPress={this.quebrarBiscoito}>
        <View style={style.btnArea}>
          <Text style={this.styles.btnTexto}>Quebrar Biscoito</Text>
        </View>
      </TouchableOpacity>

      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
      flex: 1,
      alignItems: 'center',
      justifyContent: 'center'
  },
  img: {
      width: 250,
      height: 250
  },
  textoFrase: {
      fontSize: 20,
      color: '#dd7b22',
      margin: 30,
      fontStyle: 'italic',
      textAlign: 'center'
  },
  botao: {
      width: 230,
      height: 50,
      borderWidth: 2,
      borderColor: '#dd7b22',
      borderRadius: 25
  },
  btnArea: {
      flex: 1,
      flexDirection: 'row',
      justifyContent: 'center',
      alignItems: 'center'
  },
  btnTexto: {
      fontSize: 18,
      fontWeight: 'bold',
      color: '#dd7b22'
  }
});

export default App;