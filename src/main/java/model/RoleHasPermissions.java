package model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "role_has_permissions")
public class RoleHasPermissions implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "permission_id", nullable = false)
    private Long permissionId;

    @Id
    @Column(name = "role_id", nullable = false)
    private Long roleId;

}
