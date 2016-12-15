package org.zstack.header.vm;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.zstack.header.tag.AutoDeleteTag;
import org.zstack.header.vo.EO;
import org.zstack.header.vo.NoView;
import org.zstack.header.volume.VolumeVO;

@Entity
@Table
@EO(EOClazz = PubVmInstanceEO.class)
@AutoDeleteTag
public class PubVmInstanceVO extends PubVmInstanceAO    {
     
 
}
