package com.iesmac.user.vo;

import com.iesmac.user.entity.UserAdmin;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private UserAdmin userAdmin;
    private Department department;

}
