package com.example;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.types.ObjectId;
import java.util.ArrayList;
import java.util.List;
import com.mongodb.client.MongoCollection;

public class FuncionarioDAO {
    private final MongoCollection<Document> collection;

    public FuncionarioDAO(){
        collection = new MongoConnection().getDatabase().getCollection("funcionarios");
    }

    // Inserir funcionário
    public void inserirFuncionario(Funcionario funcionario) throws Exception{
        Document doc = new Document("nome", funcionario.getNome());
        doc.append("setor", funcionario.getSetor());
        doc.append("cargo", funcionario.getCargo());
        collection.insertOne(doc);
        System.out.println("Funcionario inserido!!");
    }

    // Listar todos os funcionários
    public List<Funcionario> listFuncionario(){
        List<Funcionario> funcionarios = new ArrayList<>();
        try (MongoCursor<Document> cursor = collection.find().iterator()){
            while (cursor.hasNext()){
                Document doc = cursor.next();
                Funcionario funcionario = new Funcionario();
                funcionario.setId(doc.getObjectId("_id"));
                funcionario.setNome(doc.getString("nome"));
                funcionario.setSetor(doc.getString("setor"));
                funcionario.setCargo(doc.getString("cargo"));
                funcionarios.add(funcionario);
            }
        }
        return funcionarios;
    }    

    //Listar funcionário por nome
    public Funcionario buscarPorNome(String nome){
        Document doc = collection.find(Filters.eq("nome",nome)).first();
        if (doc != null){
            Funcionario funcionario = new Funcionario();
            funcionario.setId(doc.getObjectId("_id"));
            funcionario.setNome(doc.getString("nome"));
            funcionario.setSetor(doc.getString("setor"));
            funcionario.setCargo(doc.getString("cargo"));
            return funcionario;
        }

        return null;
    }

    //Listar por ID
    public Funcionario buscarPorID(ObjectId id){
        Document doc = collection.find(Filters.eq("_id", id)).first();
        if (doc != null){
            Funcionario funcionario = new Funcionario();
            funcionario.setId(doc.getObjectId("_id"));
            funcionario.setNome(doc.getString("nome"));
            funcionario.setSetor(doc.getString("setor"));
            funcionario.setCargo(doc.getString("cargo"));
        }

        return null;
    }
} 