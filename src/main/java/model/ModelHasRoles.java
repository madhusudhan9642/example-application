package model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "model_has_roles")
public class ModelHasRoles implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "role_id", nullable = false)
    private Long roleId;

    @Id
    @Column(name = "model_id", nullable = false)
    private Long modelId;

    @Id
    @Column(name = "model_type", nullable = false)
    private String modelType;

}
