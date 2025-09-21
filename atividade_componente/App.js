import React, { Component } from 'react';
import { Text, View, StyleSheet, TextInput, Button, Alert, Switch } from 'react-native';
import { Picker } from '@react-native-picker/picker';
import Slider from '@react-native-community/slider';

class App extends Component{
  constructor(props){
    super(props);
    this.state = {
      input: '',
      sexo: 0,
      sexos: [
        { key: 0, nome: 'Masculino'},
        { key: 1, nome: 'Feminino'},
      ],
      valor: 0,
      status: false
    };

    this.botao = this.botao.bind(this);
  }

  botao() {
    if (this.state.input === '') {
      window.alert("Erro: Digite seu nome!");
      return;
    }
  
    const sexoSelecionado = this.state.sexos.find(sexo => sexo.key === this.state.sexo);
  
    const mensagem = 
      `Conta Criada!\n\n` +
      `Nome: ${this.state.input}\n` +
      `Sexo: ${sexoSelecionado ? sexoSelecionado.nome : "Feminino" }\n` +
      `Limite: R$ ${this.state.valor.toFixed(2)}\n` +
      `Estado civil: ${this.state.status ? "Casado" : "Solteiro"}`;
  
    window.alert(mensagem);
  }

  render(){
    let sexoPessoa = this.state.sexos.map((v, k) => {
      return <Picker.Item key={k} label={v.nome}/>;
    });
    return(
      <View style={styles.container}>

        <TextInput
        style={styles.input}
        placeholder='Digite seu nome aqui'
        underlineColorAndroid='transparent'
        onChangeText={ (texto) => this.setState({input: texto}) }
        />

        <Text style={styles.texto}>Sexo:</Text>
        <Picker
          selectedValue={this.state.sexo}
          onValueChange={(itemValue) =>
            this.setState({ sexo: itemValue })
          }
        >
          {this.state.sexos.map((v) => (
            <Picker.Item key={v.key} label={v.nome} value={v.key} />
          ))}
        </Picker>
        
        <Text style={styles.texto}>Limite da conta:</Text>
        <Slider
          minimumValue={0}
          maximumValue={10000}
          onValueChange={(valorSelecionado) => this.setState({ valor: valorSelecionado })}
          value={this.state.valor}
          minimumTrackTintColor="#00BFFF"
          maximumTrackTintColor="#778899"
        />
        <Text style={{ textAlign: 'center', fontSize: 20 }}>
          Seu limite: {this.state.valor.toFixed(2)} R$
        </Text>

        <Text style={styles.texto}>Estado civil:</Text>
        <Switch
          value={this.state.status}
          onValueChange={(valorSwitch) => this.setState({ status: valorSwitch })}
          thumbColor="#778899"
        />

        <Text style={{ textAlign: 'center', fontSize: 20 }}>
          {this.state.status ? "Casado" : "Solteiro"}
        </Text>

        <Button title='Abrir conta' onPress={this.botao}/>

        <Text style={styles.texto}>{this.state.nome}</Text>

      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
  input:{
    height: 30,
    borderWidth: 1,
    borderColor: '#222',
    margin: 10,
    fontSize: 20,
    padding: 10,
  },
  texto:{
    fontSize: 25
  }
});

export default App;
