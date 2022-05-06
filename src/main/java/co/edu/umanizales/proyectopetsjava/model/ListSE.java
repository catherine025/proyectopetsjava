package co.edu.umanizales.proyectopetsjava.model;

import java.util.ArrayList;
import java.util.List;

public class ListSE {
    private Node head;
    private int count;

    public void add(Pet pet) {
        if (this.head == null) {
            this.head = new Node(pet);
        } else {
            Node temp = this.head;
            while (temp.getNext() != null) {
                temp = temp.getNext();

            }
            //Parado en el ultimo
            temp.setNext(new Node(pet));
        }
        count++;

    }

    public void addStart(Pet pet) {
        if (head == null) {
            head = new Node(pet);

        } else {
            Node newNode = new Node(pet);
            newNode.setNext(head);
            this.head = newNode;
        }
        count++;
    }

    public void addToPosition(int position, Pet pet) throws Exception {
        if (position > 0 && position <= this.count + 1) {
            if (position == 1) {
                this.addStart(pet);

            } else {
                Node temp = head;
                int count = 1;
                while (temp != null) {
                    if (count == position - 1) {
                        Node newNode = new Node(pet);
                        newNode.setNext(temp.getNext());
                        temp.setNext(newNode);
                        this.count++;
                        break;
                    }
                    temp = temp.getNext();
                    count++;
                }
            }

        } else {
            throw new Exception("La posicion no es valida");
        }

    }

    public void deleteToPosition(int position) throws Exception {
        if (position > 0 && position <= this.count) {
            if (position == 1) {
                this.head = this.head.getNext();
                this.count--;
            } else {
                Node temp = head;
                int count = 1;
                while (temp != null) {
                    if (count == position - 1) {
                        temp.setNext(temp.getNext().getNext());
                        this.count--;
                        break;
                    }
                    temp = temp.getNext();
                    count++;
                }
            }
        } else {
            throw new Exception("La posición no es válida");
        }
    }


    public void invert() throws Exception {
        if (this.head != null) {
            ListSE listCp = new ListSE();
            Node temp = this.head;
            while (temp != null) ;
            {
                listCp.addStart(temp.getData());
                temp.setNext(temp.getNext());

            }
            this.head = listCp.head;

        } else {
            throw new Exception("La lista está vacía");
        }
    }

    public void toExchange() throws Exception {
        if (this.count > 1) {
            Node temp = this.head;
            Pet temp1 = this.head.getData();
            while (temp != null) {
                if (temp.getNext() == null) {
                    this.head.setData(temp.getData());
                    temp.setData(temp1);
                    break;
                }
                temp = temp.getNext();
            }
        } else {
            throw new Exception("La lista no es válida");
        }
    }

    public void mixByGender() throws Exception {
        if (this.head != null) {
            if (this.count > 1) {
                ListSE listMales = new ListSE();
                ListSE listFemales = new ListSE();
                Node temp = this.head;
                while (temp != null) {
                    if (temp.getData().getGender() == 'M') {
                        listMales.add(temp.getData());
                    } else {
                        listFemales.add(temp.getData());
                    }
                    temp = temp.getNext();
                }
                //Dos listas "Llenas" de Machos y Hembras
                if (listMales.count == 0 || listFemales.count == 0) {
                    throw new Exception("Solo hay datos de un genero");
                } else {
                    //Intercalar
                    Node tempH = listFemales.head;
                    int pos = 2;
                    while (tempH != null) {
                        if (pos > listMales.count) {
                            listMales.add(tempH.getData());
                        } else {
                            listMales.addToPosition(pos, tempH.getData());
                        }
                        tempH = tempH.getNext();
                        pos = pos + 2;
                    }
                    this.head = listMales.head;
                }

            } else {
                throw new Exception("No hay datos suficientes para intercalar");
            }
        } else {
            throw new Exception("No hay datos para intercalar");
        }

    }