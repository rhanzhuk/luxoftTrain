package anatationPack;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.StringJoiner;

public class QueryGenerator {
    public String getAll(Class<?> clazz) {
        Table tableAnnotation = clazz.getAnnotation(Table.class);
        if (tableAnnotation == null) {
            throw new IllegalArgumentException("annotation @Table is missing");
        }

        String tableName = tableAnnotation.name().isEmpty() ?
                clazz.getName() :
                tableAnnotation.name();

        StringBuilder sqlQuery = new StringBuilder("SELECT ");

        StringJoiner columnNamesJoiner = new StringJoiner(", ");
        for (Field field : clazz.getDeclaredFields()) {
            Column columnAnnotation = field.getAnnotation(Column.class);
            if (columnAnnotation != null) {
                String columnName = columnAnnotation.name().isEmpty() ?
                        field.getName() :
                        columnAnnotation.name();
                columnNamesJoiner.add(columnName);
            }
        }

        sqlQuery.append(columnNamesJoiner);
        sqlQuery.append(" FROM ");
        sqlQuery.append(tableName);
        sqlQuery.append(";");
        return sqlQuery.toString();
    }

    public String insert(Object value) {
        Table tableAnnotation = value.getClass().getAnnotation(Table.class);
        if (tableAnnotation == null) {
            throw new IllegalArgumentException("annotation @Table is missing");
        }

        String tableName = tableAnnotation.name().isEmpty() ?
                value.getClass().getName() :
                tableAnnotation.name();

        StringBuilder sqlQuery = new StringBuilder("INSERT INTO ");
        sqlQuery.append(tableName);
        sqlQuery.append(" (");
        StringJoiner columnNamesJoiner = new StringJoiner(", ");
        for (Field field : value.getClass().getDeclaredFields()) {
            Column columnAnnotation = field.getAnnotation(Column.class);
            if (columnAnnotation != null){
                String columnName = columnAnnotation.name().isEmpty() ?
                        field.getName() :
                        columnAnnotation.name();
                columnNamesJoiner.add(columnName);
            }
        }
        sqlQuery.append(columnNamesJoiner);
        sqlQuery.append(") VALUES (");
        sqlQuery.append(columnNamesJoiner);
        sqlQuery.append(");");


        return sqlQuery.toString();
    }

    public String getById(Class clazz, Object id) {
        //TODO this method
        return null;
    }

    public String delete(Class clazz, Object id) {
        return null;
    }
}
