import 'package:flutter/material.dart';
import 'package:fatecjobs_frontend/widgets/login.dart';
import 'package:fatecjobs_frontend/widgets/selecionarCadastro.dart';
import 'package:fatecjobs_frontend/widgets/formularioaluno.dart';
import 'package:fatecjobs_frontend/widgets/formularioprofessor.dart';
import 'package:fatecjobs_frontend/widgets/formularioempresa.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget{
  @override
  Widget build(BuildContext context){
  return MaterialApp(
    title:'FatecJobs',
    theme:ThemeData(primarySwatch: Colors.black),
    home:Login(),
  );
  }
}
class Cadastro extends StatelessWidget{
  @override 
  Widget build(BuildContext context){
    return MaterialApp(
      title:'FatecJobs',
      theme:ThemeData(primarySwatch: Colors.black),
      home:SelecionarCadastro(),
    );
  }
}
class Fomulario1 extends StatelessWidget{
@override
Widget build(BuildContext context){
  return MaterialApp(
    title: 'FatecJobs',
    theme: ThemeData(primarySwatch: Colors.black),
    home: FormularioAluno(),
  );
}
}
class Fomulario2 extends StatelessWidget{
@override
Widget build(BuildContext context){
  return MaterialApp(
    title: 'FatecJobs',
    theme: ThemeData(primarySwatch: Colors.black),
    home: FormularioProfessor(),
  );
}
}
class Fomulario3 extends StatelessWidget{
@override
Widget build(BuildContext context){
  return MaterialApp(
    title: 'FatecJobs',
    theme: ThemeData(primarySwatch: Colors.black),
    home: FormularioEmpresa(),
  );
}
}