package kr.co.vibevillage.customerServiceBoard.mapper;

import kr.co.vibevillage.customerServiceBoard.model.CustomerServiceDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerServiceMapper {
    public List<CustomerServiceDTO> customerServiceXML();

    List<CustomerServiceDTO> getnbCustomerService();

    List<CustomerServiceDTO> getqaCustomerService();
}
