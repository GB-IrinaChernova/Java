package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


        /**
     1. Доработать счетчик.
     2. Изменить тип отображаемого значения счетчика на тестовое поле (JTextField).
     3. Добавить возможность изменять значение счетчика во время работы приложения, с помощью ввода нового значения в текстовое поле и нажатию Enter.
     Уточнение: (После нажатия на Enter дальнейшее увеличение и уменьшение счетчика происходит от нового заданного значения)
     **/

public class Counter extends JFrame {
        private int value;

        public Counter(int initialValue) {
            setBounds(500, 500, 500, 320);
            setTitle("Счетчик");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

            Font font = new Font("Calibri", Font.BOLD, 35);

            JTextField counterValue = new JTextField();
            counterValue.setFont(font);
            counterValue.setHorizontalAlignment(SwingConstants.CENTER);
            add(counterValue, BorderLayout.CENTER);

            value = initialValue;
            counterValue.setText(String.valueOf(value));

            JButton decrementButton = new JButton("<");
            decrementButton.setFont(font);
            add(decrementButton, BorderLayout.WEST);

            JButton incrementButton = new JButton(">");
            incrementButton.setFont(font);
            add(incrementButton, BorderLayout.EAST);

            counterValue.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    System.out.println(counterValue.getText());

                }
            });

            decrementButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    value--;
                    counterValue.setText(String.valueOf(value));
                    }
            });

            incrementButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    value++;
                    counterValue.setText(String.valueOf(value));
                }
            });

            setVisible(true);
        }

        public static void main(String[] args) {
            new Counter(0);
        }
    }
