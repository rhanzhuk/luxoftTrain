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
        return null;
    }

    public String getById(Class clazz, Object id) {
        return null;
    }

    public String delete(Class clazz, Object id) {
        return null;
    }
}
