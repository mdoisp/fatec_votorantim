/*
import React, { Component } from 'react';
import { View, Text, StyleSheet, FlatList } from 'react-native';

import Pessoas from './src/Pessoas/Pessoas';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      lista: [
        { id: '1', nome: 'Matheus', idade: 50, email: 'matheus@matheus.com' },
        { id: '2', nome: 'Thiago', idade: 33, email: 'thiago@thiago.com' },
        { id: '3', nome: 'Lucas', idade: 20, email: 'lucas@lucas.com' },
        { id: '4', nome: 'Henrique', idade: 50, email: 'henrique@henrique.com' },
        { id: '5', nome: 'Thiago', idade: 33, email: 'thiago@thiago.com' },
        { id: '6', nome: 'Lucas', idade: 20, email: 'lucas@lucas.com' },
        { id: '7', nome: 'JOSE', idade: 33, email: 'thiago@thiago.com' },
        { id: '8', nome: 'HENRIQUE', idade: 20, email: 'lucas@lucas.com' },
      ],
    };
  }

  render() {
    return (
      <View style={styles.container}>
        <FlatList
          data={this.state.lista}
          keyExtractor={(item) => item.id}
          renderItem={({ item }) => <Pessoas data={item} />}
        />
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
});

export default App;
*/
/*
import React, { Component } from 'react';
import { View, StyleSheet, Text } from 'react-native';
import { Picker } from '@react-native-picker/picker';

export default class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      pizza: 0,
      pizzas: [
        { key: 1, nome: 'Strogonoff', valor: 35.90 },
        { key: 2, nome: 'Calabresa', valor: 59 },
        { key: 3, nome: 'Quatro queijos', valor: 37 },
        { key: 4, nome: 'Brigadeiro', valor: 25.70 },
        { key: 5, nome: 'Portuguesa', valor: 70 },
      ]
    };
  }

  render() {
    let pizzasItem = this.state.pizzas.map((v, k) => {
      return <Picker.Item key={k} value={k} label={v.nome} />;
    });

    return (
      <View style={styles.container}>
        <Text style={styles.logo}>Menu Pizza</Text>

        <Picker
          selectedValue={this.state.pizza}
          onValueChange={(itemValue, itemIndex) =>
            this.setState({ pizza: itemValue })
          }
        >
          {pizzasItem}
        </Picker>

        <Text style={styles.pizzas}>
          Você escolheu: {this.state.pizzas[this.state.pizza].nome}
        </Text>
        <Text style={styles.pizzas}>
          R$: {this.state.pizzas[this.state.pizza].valor.toFixed(2)}
        </Text>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    marginTop: 20,
  },
  logo: {
    textAlign: 'center',
    fontSize: 28,
    fontWeight: 'bold',
  },
  pizzas: {
    marginTop: 15,
    fontSize: 25,
    textAlign: 'center',
  }
});

import React, { Component } from 'react';
import { View, StyleSheet, Text } from 'react-native';
import Slider from '@react-native-community/slider';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      valor: 0,
    };
  }

  render() {
    return (
      <View style={styles.container}>
        <Slider
          minimumValue={0}
          maximumValue={100}
          onValueChange={(valorSelecionado) => this.setState({ valor: valorSelecionado })}
          value={this.state.valor}
          minimumTrackTintColor="#00BFFF"
          maximumTrackTintColor="#778899"
        />
        <Text style={{ textAlign: 'center', fontSize: 30 }}>
          Você tem {this.state.valor.toFixed(1)} Kg
        </Text>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    marginTop: 50,
  },
});

export default App;
*/

import React, { Component } from 'react';
import { View, StyleSheet, Text, Switch } from 'react-native';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      status: false
    };
  }

  render() {
    return (
      <View style={styles.container}>
        <Switch
          value={this.state.status}
          onValueChange={(valorSwitch) => this.setState({ status: valorSwitch })}
          thumbColor="#FF0000"
        />

        <Text style={{ textAlign: 'center', fontSize: 30 }}>
          {this.state.status ? "Ativo" : "Inativo"}
        </Text>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    marginTop: 50
  }
});

export default App;
