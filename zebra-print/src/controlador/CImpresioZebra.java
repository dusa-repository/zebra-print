package controlador;

import java.awt.print.PrinterJob;
import java.io.IOException;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Textbox;

import javax.print.PrintService;
import javax.print.PrintServiceLookup;

import java.lang.Exception;
import qz.PrintRaw;
import qz.PrintServiceMatcher;


public class CImpresioZebra  extends SelectorComposer<Component>  {

	private static final long serialVersionUID = 851304641959991032L;
	
	@Wire
	private Button btnExport;
	
	@Wire
	private Textbox hai;
	

	@Listen("onClick = #btnExport")
	public void mostrarCatalogo() throws IOException {
		
		 try {
			 //String rawCmds = "^XA^FO50,50^AQB,18,10^FD1234567^FS^XZ";
			 //String rawCmds = "^XA~TA000~JSN^LT0^MNW^MTD^PON^PMN^LH0,0^JMA^PR4,4~SD15^JUS^LRN^CI0^XZ^XA^MMT^PW839^LL1239^LS0^FO640,384^GFA,00768,00768,00024,:Z64:eJzdkDFqw0AQRWeykJ1iQe0UAyt8gsVpVLjIXXKBTeXGRHJU2EXAuDf4Gi6luNAlDFnwBbZ0IEix8foILpJffh5vPgPwx4M/uh3AhpmNGAXbZnbtVZ+FocpCn0V1Epg3b4nX4hn4dS+s5cw/d4l/KJiBnuZLNjSGOv/ka6+9CMgUDxMDU+y8l+R3xJAdYRUNjOA9T3dxcMJg97htBF6wczb5a3fxK1wGA2W1iCrx6tIL4sEbKtfd6bZHsTvzWJN7NO3ug483v43sGQcp9Hf7tZEy7exVxTlBQYyhWhFN+G4//0f5BcMFQy8=:E4F2^FO576,480^GFA,01280,01280,00020,:Z64:eJztkSFPw0AYhr+uyW6BppUc9Lprwh9oXRMEf6VT2KsagqzNKjBLJhBU4PZH2lzIGeYREyUVmxxBzHF8N8WwJAiyV5x48uS9N3cAxxzzN7FqMSEg4u1drmx76JEGYZ3qEqJkm+iunA69+VsB0I60AiGMp/qcs1GNrCslhNHmNrWle3E6SNHLlIVe/LoSRLKAQ9YUEErosG9TtXY3O/eLVhbowQ2I7GWVqzELzqzaeFP0sK/K5aVDH6y2BYjvYYx9y6dc+Sx4xAkAV+W+b4l9fkUXRYSeT8y94pmlhLNgByIFOLFxXyIUTXueQxeDED1uaaWv3xXLdx4LPpjZ54IuP3krqe7IjHZzs8+FCdFeg96aOGxNGvS+xzXHIYL+/kEPWc+wHx4x7Pd/91/zBZWudH4=:E623^FO32,608^GFA,02560,02560,00040,:Z64:eJztkrGL1EAYxd84y84VYXJ2AQNBtrHMsYUDt9w25x8id7VksTgL4SIBD2RJWuXE/8FuO+eIaHOo11lcMZj+CNgMXNj4ZfZSr5U2eZBAhpffvHnzAYMGDfpn8uupsUgUbw2vjILyLYSA5FlWA9+zql05X2QXJkESsFbjQgdQUQPufMKCnWVl+3bDaybEswEnX5UGmPlr8LzzFQ1YQbyNzwsXP2r8DBACJwjw0vPALhGJUoZg4rPe9ZxPyunHFazCDJhD4UZKoMF+Vn3YAS9+GSVV5wvHi6uYXTveAfEOQ/r/Be7zI1rg4omOR4HbVz58t2JLtfEpfPMbwBJvQrm4vOl53qjjLR0vJN6Xzpdg72xKC0Ic6t1Rn+9c8bznsdI3HW+v3He8Z8TDXb7zmK8d7zGoxjABu8Zp+cDxjnU83vQiJ2/Une95SjVSVOqlrYrlDu7JRz2P+stj0Trf05R4HtW2xOlXn/oTY9Xn85tprgSf25mk+5jfZvkBxYWp/GKtuFT9eel+X8eCR3XosQsd/WbvZUxzoE+EaGJOvNhz/flmkivJP9lQ8tTMb9mlpM9UH2Wv6q4Hozy1deiYO8H24eQpvYLtPvaXPmh6tscbNGjQf9EfsK2eiA==:85DB^FO288,480^GFA,01792,01792,00028,:Z64:eJztkLFKw1AUhpP2Wu8Q7C04RAgcccicbpnMjRSfo6HS3UUcxNwmkjgEsrr1FXyD3EHMEuwrJAjVQSTdKkg0N67N6JYPzlk+fv7DkaSOjo5/5tYK/RzSr8BaSpViWPG654R8w4RzIU5LSDeBC6zSCCxTZA+LsnGzR/xiqvMjDx8z79Qw+sODOR4/RMLZBCFCzkcDROnZoUH6e+iCyGwi3E8SR7ju85Q8r3TD8qPoU5VK3twC+xmGtyJQKP0+ISDj6IqU11S4qSG9Y1V3AjzNWdN3P1NLNReOEmVCiD6+Q5ecunUfPDnaSP3LWfFqC2uzUizGX5PENz+cuNhmTQ7CBYdn7UYBidsACzJxUl5muz81EIvtdqgeueXDPeFach0dLfwCHKBdxA==:0EC7^FO32,480^GFA,02048,02048,00032,:Z64:eJztkr2KGzEUhc+gZdSYcYotphDx5g0EC0EhYBtS7GvMkiLtuNpUq2sGsk3wE+RBUo6Ywk0eQkaQNhPSDMTMjTQmkMakTvDhokIfR/dPwEUXXfTPat6zH0QPpkcxQrZLmOfItZnTskh8MVh3lEdYx4Kx6BW0wpWuV97mk//IYZyP4MAN02qI/iVm2rPnD4nP1Frmaoa1c3sBU19DX0Nt2n7jnhIvCi9yU8AHCoLMzUuYGLfkX4QmFaBUJamUqN7hTqDGA/QDytuszaLvlL8bjAB/RWCq8BYmxmrb4ih2iaf6n0nYPe7G6L+Hvkdpnett9rv/x+R/QhhQIZCJ8frQDYuGUv54J1N+iTcq+u0nbUnr6M9c4jP4QnyO9QsKO5gb/miYjPb+FXUnvpZSKawzt5cwG/6y4bas69i/m/pPk4vz84IbSauf228/tt7o9zxws5vy28MY519lLAQtvtP+QG2pTZx/k0/vp/15eCwjn3cUOvKlSfsTxbmlq+mUZz/FyZif5Vd/4cUf50X/s34BLc+ryw==:EA9A^FO32,960^GFA,08192,08192,00064,:Z64:eJztlztu5DgQhkUoYKgj8Cg8GrlwsKGP4KOMgDnICNgLCHCigGBN/VVFiVI3Np0JSNhtNamfHx/18jSNNtpoo4022mij/fkWj7fdjrI+hNL1BiKqnodC8fzEPTPxN8fdGx7lD7qnhXhezEHysWo39GWG/mA99/J7/Al9aXpP0CfugJ5f2/kb60vjQx9FzyORGCTKfNOjA/ogy2zLEr5jYtqhP8BhEPi09vpZVgeQ6NPe8TEbbV7WPEmH6DfTL9jwIo9Ygi7k6PiYjVbVi1I/96ceb4meP2/8dDjlV9u56I9eH2V355nc+XHn2/VC9rQvtN70AdcSyZmeD2qbUjH+oSbDV+Arv5kXvLI53aIOR9EfUyyi58l5I9X4u5oUn7EvDGc9HyEvR+1MhoXPRxSgx2Xwc6o9f6ks89h8DnI5sIilnvxNLpw7dH5eC++043viMY/DX0GNwveNH2FWvAYv+iIrS3Tj01fBML8F74mH6/lJ9Fn1mJ/ngHX2fO4Gj/U7VDd++rWL93le9ooZF/DXjj/Tj0P5G/RLufHpCw6RpxmrwPpwEGydF9/BtsBLazJ9z/88Jic+BD33MCmx/uJP4iay/7Sd/NL4n+A3/SH6O3+CSev+2bH5CbjF+I7kZp78/S0/466X2t//TGIZnZ6/8IGd9o9wonxe9sUPPf+pT1/H6X+4cb1exsJWfe3tf66zGbvoN+V/lp4f9Ly98av6v/JnvOlNL+fjVN/xRV+xDOy/0yufLn5q/NrzcVbq/x1/U76chn/o07/0wtdQeOlX5Ys1vPA/6OO5fw2Fdv5Yy8XPF1/3n/6hj+f5t1DM/Jk0GQlfwtYr/2dnf3L/spRr/7sN8xxpPe+/7T/Tz6f9aWA99ZsNB7jty/1n+u9p/3Jkp/1d/L3jryc/fd/4O/RF4hzfplNHk+Goqehh/zl+v/H/6eJLmg97p3en/4Efv9/EH+PjxpZ653P82Tr/z5HexD/mm16zbhDfJE0IM+K/WgTzA/XxNzYXkfgJ/0dRIsOWyiz+tvjHieA1/jc94u8s9mv8w7X43+Ivz3/LPye/xf9Z/KfxYRdLH/9Z/5r/Jo06Cdt1zf+o+QXy32r5B/O/5l88Vs2feTL/t1TA3yT/tvzH+ouPhLkqfwFZjjup7VkqSAd+rvzLJcbFl/PxVua1/B/V9i0Ux9rqh03yf56o+T9Z/VP0KrT+OOOv09CmgQKVjdYfGSVI02v9VdUUtfLLchJBMw//tvqr1T8ZJYTprf4r5gpSf8GKhI9pZzLvPOu3nt/qT3Nxrf/O/KN64eau/tP1Kd9r/VssFJGmO5x0ULd0WhFKFRK0/szmoGT1d6zGj7A28LWqlmXgMUnZm3EQWkiHji8mqHyP4xF3A2yXNOyEu/f1d1Z7FT4QS+Nb/Z9VdCD8arkvZX/WWDfZ+bxr4f3/H9d4+f/x0UYbbbTRRhtttNFG+1vbby52SPc=:1AEC^FO32,832^GFA,01280,01280,00020,:Z64:eJztkEFqxDAMRSUM9aaQC3jsaxgaMlfq7LqYRUOhy16hV1GYRa+hkAskO0NDVMlp7lDK/MUHf54t+QPcdddfExaUOW0oW+cIMlvmBWVNZgEJnsmyRnrZkplxpXJJBuPMlLtU7uxH7qIbGc5vR9biSDGgZqknLwvvGccIxt2oEbbsCotyanAajLPLGRbZlJOSJ4Lp1bgXzVblpARlbvUfxY7RrP02Dvb3hEKFL4RflcswTlzn5iebu++30BxQ92pPOne2rNMvlGg7t+ngkh/oGtzAEBLhO/x2wJ11sOWG3Afw3h9F62oNntwD7lnP6dP6a/3B4YrUpNV6duQfK/d/9QO96KcU:7EB8^FO32,736^GFA,02816,02816,00044,:Z64:eJztky1v3EAQhme1UpdUdzRglfsLhZZa+fpTXBWU7qkkqN6TgUnk0oL7IUXVrCzVrLggYE4GoRuFGJwynfVHikqqggK/Ztajx6N3xgBr1vxvucAnhZE97St/0Z7Mk2ZvYeuB/TWQ5s+Mw4QqVnxEx4RlOLJCNKwZLRgExh281dwxxok1XHFPjocz9zVXROmFz2FLwLSfvOfZa0wdQnSFexcea9MKq1sAmQEB3R4KDZCpu4nd6K0/D5Gy3reNTqzqvbAbAoqvPWkPmT5N7EswcPjp0LagblWIaNTotYV4Dz55r9TJTF55HgeXvLqB/isZEO815OJ1H2dvM7EWXsDhzhX2A8in+i+JTZ1Zl7xYSIGZ3izsBh5+RLL3PrGnhc1upIczUWJNA7+932XeDtQJwi0aaEfWSb+I0q+/MpMW8jTvvaM3Mu836Jtp3hz2A/CRaZx3y4tXemhl3vcyr2prmnsoB0DFcex3Ycd+26Xfvl765UvaWZy9ft5bF2RxeBPCQ21ChfPenBUvurFfq/zzPbQhLvdQjfeAuyfaiNdn3DNmua5HVo93FksqyrZifaTxznYXYVHYUthXVnV/vt+JffZmqvP/5F9Zs2bNmjV/k1/rISjr:AE26^FO416,608^GFA,01280,01280,00020,:Z64:eJzt0EEKwjAQBdCELrKR5AKBXsFlF8VexSNMcNOFkIgXS+lFxhtE3AwoxBTtqHiD0k9Wj0+SGSHWLD2dqINHqINCNh89+gQ+1WkmmTFTpnK6B9twSQCtS/3RzlaFERvYOdyCZhMyWrAuClCWe1Vok75FgWY2JWSwsCk9VB8rPdCHM6ESPz3tTrRnM9N9pO8jofnqvd61wMb/a3r+nxyuf3NM86ZMaZqXMfNeiO29P1P2x7ZmGXkCh6ddwg==:9030^FO416,384^GFA,00768,00768,00024,:Z64:eJzlkbFKA0EQhv/NgNtIrk1xEB8hYBMwGH0TH+GuMsXBTVjwGrHO4xwceF2ewGKP9HJ2KeTGiberhZ3YOcUW3/wM//8v8O/GPEPqsscacxAXKOLiAeLLoy6vlW/MEPUvRvryqM9a+TtJ5I/wmztQ7a+Y+JUcf/MiU35zz7TdW6pHngzwS9UzLlW/J56MfC7GpxkskNe0bam3I6cd/KzsCeiUV2agkdsUPi1PKuWuRfQzmZ24V5X35Bwn/HW//7yvCagS/uHHSOecOBO4XQT/t/LWWmkjP1uEvAfOmyc0Ma/NQj+HOpfENFKNfHoR+mx4OUzRSfB/noX+LVaFZins7/7xT+YDhsR8Ew==:654E^FO32,384^GFA,00768,00768,00024,:Z64:eJzlkTFqAzEQRUcMrJpl1W4h2Gu4y2FygYALu3AxRoWbsHuBkLMobKFbGIGKPUCaFIvHI8lJcCBlqqiReDxGX18A/2ypD1iRkVZ4ACRYNQfOHC9C2TkmJqR8XpiEG85GCPzGEX0+L8XvjHHumCY3x4hkHLVNmW+bQc3H90k5ekIalLe68B46SJRGuXSD1EHsGyHig1UL7V5Bwx69VVH8zDfQiv84Che/hdhqrtyqRNuXIWRe/JKn+ttnM9/8vvJDnu93Z/G/5lf/lifRvuT5mX/2d/k7M92/t69+7ufE4VT6kXZI8ozC9XefXnaGtvLP/g+5f5ZvEH/681//dV0BZ7qLag==:37A7^FO32,1152^GFA,01024,01024,00016,:Z64:eJztjz0OwjAMhV0VEQbLrBkicgVGb74KR2BkYGbkPBwnR+iYwUpJpfy0IyNS3/bpk5/1APb8lnOSaALTEAqrqI8Wh6l7UaaxMMIV2HUmYHicMn+6v4NFYw/NB2AyTLU/3kCSccfGITNdYOW9IsLmXtK6n8nP2/8yd/90Fp2pXlQSE4/v4vO+aeFX88v+6vf8c76HVDJw:0F83^FO32,1088^GFA,01024,01024,00016,:Z64:eJxjYBgFgxvI/3n8v/FDDfMBGP/H4/8HP9gwP4DLP///8EMNO4wvwfC44eGHPDhfBsj/eCGGvQBZ/sYdPgMOmPzzxod37vAVyCDMf3iij8+CB8m+u3dkbBD2/2Ps6JGQgJv//Dzj2Tv2fxDmtzee6bP/h7C/+eDROfX/EPKND/t7LPgQ+hs/HpcpYJdBcl87XwI7D8L9hUjyo4CaAAD33k/c:2031^FO544,32^GFA,01024,01024,00016,:Z64:eJztkDEOwjAMRR0GWCp1LVJQe4SyhSlXyREysjVHMxPXsMQFwpahkgl2OzCjbv3b01P8pADs2/fHJmwhGn4ynawwtWkw/GI6OOHcp8ULB9en0SSwoD7eLxgNVj5G9Q6H6hvwhb7e3RY/zVk9jYbRQjOQ3I85Kgfth1D72Kz84Ly+l/vARfu+SN9wUW9RPbkg/Q7Vo53eTBbOKP3KXrhL9OOvSBv/9Qb7AEURVTg=:002D^FO288,256^GFA,01280,01280,00020,:Z64:eJztkDEKAjEQRUcGTKcHUNwrCDYBhVzFI8RKK7MS0G72Bu5VIhZeY8ELRGwWXIiDJOv2gtX+8jN5/+cD9PqXjDNNdglPEvm+9byqVRVehHnIk9eoxjzCq0QbXPTmUoL2iIW1toqenmrQWmBxOw2Stx7xHQyRrkeo4mM9k2BAYHktYBO9+YhzHSLdqfX0zNSZF0hbYkbiqRo98xYE65SbSYAd85ZFe6c5t5LMmxB0+3m+o6zTb8X9dswbf//x+S/nnsc2XGIX9dmFeeIQDq6zn2Me7zdIw/Tq9YPeW69exg==:10C4^FO32,256^GFA,01280,01280,00020,:Z64:eJztUbFtxDAM5EPAszGoVgVhreCShRCv4hFUpvMPECQLZBiPohFUuhDsnJwh8gH+gMMRhwNxlIheeCpw4S1W3m5N162P8PzuSgTdMazVFd/gzY1rBP2pax9PeJa4hJGL+O/JuKjAy4GzCnjXrBCGt5BMQUAaFsjgPpGj8V1HkDR34S+iQmJhFDPSScS05wppik1T6jlNyo/Ls7grctinNrgH3SrFFtGw74uQ39zcAnjtm5sih37roQT2fpDez95MApmI/1iSySDXvdkrZX/dm308PVHcMwfK7A6da+bYpL9fZuT4ej94Vf7mH1/4F/gBLblazw==:4119^FO32,128^GFA,03072,03072,00048,:Z64:eJztk7Fu2zAURR9BwFwEuR9AWL9gbypgREN+xP4DanOBwqJLIF4Ce+0QtP2NbjQ8+DdewKErgw7VIOT1UXLSzAG66a68uL4+7wpg1KhRo0a9S41vusJPfRNrgkraTnpUnaJLeiJUWMRc2a0i3A7+WLUVVti0a7J0ds/JT5K+8BNSnLbTLpeWHCHZ3t9VXRObtulqOlHYkzux/9znP1FbdQUV0tGFAvnkn5clmNiW8+Vi9+jD0TlEKZ2VAKsSy/JG57l0zmvpMPmNNmAMfjC69sHfHsQ5ohIXUPy0waUptMrVXnitRO9f5ZwPCKtsbYOVBwg/cALhJX+VZ/Ig7wCyCWAqZGYlNMLz79SnPyAfRPgZlTjblP8xbozS6ps8Augp1Mk/z5mP91C1i11gP4SvKCGQS/nUotKcf2B/PvjNrGmLJw+J/6X3P6CCX7RPqIn/i1YHNfjN0L9qZWS/X3OmvIdwn/pf+VucZEN+lsOq51OUAJ881Jyv+v5H5hNS/+YUfOT879f+fb5hPlgi36C2kvmIcJf693zgETH/1/+Vf9ww/03tpb89ivP+lT9gTPynSr3hv2T+G1OuyrWVmO7rcCLPQz5uypssnyq+bXa978t+zLL2gn7zfnax3w9xfvyc9pPmx3ugU+JZDfuM89nCAu+T5A4lGxyl/LJoi04+C7Ja0M6/2b8p+Bz9/nfD/lM+6rR/0cEWNGyF/0/f4KhRo96lv1b/Qhg=:6D2B^FO128,64^GFA,03328,03328,00052,:Z64:eJztkzGO2zAQRUkQ2GkCMaULwrqGFxGoC+QMOYNcRUWwoaHCKRKr3SJIrrFdaKhwEwQpU6SgoX6XizQsBE+GpA34BCkCTSF8CPp4+H9GjM0zzzzzzDPP/zxyEugEbujhSBsvXX0Sjgcm8Sv2JLWqJAtwYtKASx5Ajo7jHr2cSJum9PWJ5Cl5ADf+nVJAHjTvfRkyB7vIOWKgT7EzviYRpZH4DXscvdY6ctDFTzIHBsPE5tm2VRl101bcRslYoxiIwd+pGvhvENa3lUqeQkSPObpVK6P2XnMbpWFhyQo+PDyqWpKHPqlWRfLc8L1h3KztqoGoG/eS2wYkSxx68/O1KoF/Bna0qsq9FXyMnGfXetiR9o4J56GnhhriiPHhUb/qxQ7M6JZ19gAf0FIe9A2QNmvHIgc8eUrqbfj1Rt0eRAFsbVVpM4eNuTfnxI4lDrdOdNSQL2OT9z/U7VPi2EKGSx60cT8m51nbxGGYORO//64WB4DEgekqD25Gl/M85zymNqzRrNDiw06vniSA+eM0u7vkiR3wvb3kWSQOdR33U4pPO7V6C5g4TF73xo8uyNzbktsgv5z3I7voqSVuqTfdFmdP2g+nLcsi0hoVd0qPyClg039UqiQPOzrVnjmiSxwXtCbtXKjolLUEk/cz9JSnLsS2c6HVy/Ndd+jJY9uS7pp+iTpwG2XuTQzbQq1KxQ9o6a6nq7smTiUDHTPa0nMrg8C4H9yJsac8UokDmpp+sMyZOPqYR4Gn+msGllvwfEqcG37cvlALIA79UDZexzzz/NP5C5JiXYY=:29B1^FO128,32^GFA,03328,03328,00052,:Z64:eJztkzGO2zAQRYdhwcagWhcMlSMoHQvBuhKDLaJCWAlwkW5znZQMXGyZCwSLWbhIF8x2KggxQ8p2tk4RYAH9hvAA309/PgmwadOmTZvehsQpQZp7Wyc3vlAdVBBkRZTBizSNEUaSwUCX6iSDpIvnmKY0O82ebsYO1aSilgt7IGEXoZsl7qBb2INVvHgeE6Y4MGcYCUdSoU5aJYXMocyJilaOojpdv21ChHsN6Dwg9RptpSt1RP41ewB/UKjBASCf+uoJnmC0gj3iGdv32Kq6lifyIvTZY5Q30IJAPtU1z+QRDpnTwHP4sEP3ThtxYkbgCTRaN7vC0Y2F15zPFnDw7AHjB2DPOTKnzRyr+8xhT1+HWx6X5rsH5ox4DrD3DrSD8zefJzPn0U7z3tjjKrxx+kR3T4K4n5fM6cG24vSTOabszbS8tyjItCre8jDnY+Z0eJ7AuZXzkPN0M/dj9rvCMXuxXPsJA8Gnp5KHv20YOE8rfv245BnJmDUPH+MtT4/gf5d+zqHpZt5bK85fqEzAM2Pth1nq9d78Pefx4iW0Y+R+eNePdNkbe0o/1C3t334IoTmUfpBXFV2lrTwe2VP6Yc/uwnFyunC+U+as/VDvja11rXgqgi+cvlrz9JWtbm8B0+wP633ja6qrRVeJ6cB3dGGP50neWz5vnpCityUP5SekolVJMqfca/aoeumSIK/U1XPMb65Z7xtWE2pBGmaZORP/fQMkvxYOyeP8729706ZN/1N/AAhJUJg=:9ACA^FO32,32^GFA,01536,01536,00016,:Z64:eJzt0jFLw0AYBuDvjpQLBUsFOwgRg1PIII6OEQJd4+BY9CekYFGhks8OCm7+g6NTiX/A8aqWzh0EN4tTJ4mgmxKvlyv1HHRWvA7Jy8Mb3oYA/J/ffawfvPaDk/B7ziIj057p7LWmJlh6SCU1ffW9BDsQVWuwpHJZ9lPkto+2ysluGCTjwEmEo7JXppBy7vnoqXzItoJWFlRb2l2KwHvo8cKtuHQXipb8hW3lY+i63OMugq/mCzJaFMtiUcC+ctkGtNGdXpVDc1s0RFNAqN1F9NAdw7VyhOa038zIQLuH034POsoDOB6Jldu4TYZzl/117QArF7IfJ+RMv5Gi79OZN0ZiW8SrrD532S/TdNYfyXUxY7l2G+V6l3a0W42B9H1WV05Vf0/66RMW/eWT/rPI2MLO/PkcObUBi/1HW4N+f8gceVvsp118vD63Ker/T/J+fvPgyFel3JfL0k6q+wIO5LKk/tae+RqdwDpMPOUQwAGJoEai6uz5XeP72CMvRnZhYuQNcm/kTXr1OVoOywyvVMZGZrkwMr1EI5dyMM/kS47gL58PIvKR2g==:067D^FO543,55^GB276,77,8^FS^FO643,379^GB176,104,8^FS^FO433,379^GB188,104,8^FS^FO573,497^GB246,104,8^FS^FO302,497^GB247,104,8^FS^FO435,616^GB384,104,8^FS^FO33,851^GB786,103,8^FS^FO33,736^GB786,104,8^FS^FO33,616^GB386,104,8^FS^FO33,497^GB250,104,8^FS^FO32,379^GB388,104,8^FS^FO29,260^GB266,104,8^FS^FO311,260^GB508,104,8^FS^FO31,143^GB788,106,8^FS^FT572,1222^BQN,2,10^FDLA,123456789^FS^PQ1,0,1,Y^XZ";
			 
			 
			/* String rawCmds = "^XA"+
			 
			 "^BY3,3,47^FT438,1203^BCB,,Y,N" +
			 "^FD>;12345678^FS" +
			 "^BY2,3,40^FT559,1203^BCB,,Y,N" +
			 "^FD>;98765432>61^FS" +
			 "^PQ1,0,1,Y^XZ";*/
			 
			 
			 String rawCmds = 
					  "^XA~TA000~JSN^LT0^MNW^MTD^PON^PMN^LH0,0^JMA^PR4,4~SD15^JUS^LRN^CI0^XZ" +
							 "^XA" +
							 "^MMT" +
							 "^PW839" +
							 "^LL1239" +
							 "^LS0" +
							 "^FO198,57^GB266,351,1^FS" +
							 "^FO722,24^GB58,374,1^FS" +
							 "^FT163,1201^A0B,34,33^FH\\^FDCODIGO:^FS" +
							 "^FT118,1202^A0B,39,38^FH\\^FDCINCO ESTRELLAS T/F^FS" +
							 "^FT66,1201^A0B,45,45^FH\\^FDBEBIDA ESPIRITUOSA 5 ESTRELLAS^FS" +
							 "^FT160,1082^AAB,36,20^FH\\^FD31CH507001^FS" +
							 "^FT290,1199^AAB,36,20^FH\\^FDCAJAS/PAL:^FS" +
							 "^FT240,1199^AAB,36,20^FH\\^FDLOTE:^FS" +
							 "^FT344,1198^AAB,36,20^FH\\^FDPALETA:^FS" +
							 "^FT290,723^AAB,36,20^FH\\^FDN\\A7 ORDEN:^FS" +
							 "^FT68,287^AAB,27,15^FH\\^FDTicket:^FS" +
							 "^FT251,385^A0B,39,38^FH\\^FDPESO BRUTO:^FS" +
							 "^FT449,328^A0B,28,28^FH\\^FDBALANZA:^FS" +
							 "^FT714,1198^AAB,36,20^FH\\^FDAuxiliar de Op:^FS" +
							 "^FT713,869^AAB,36,20^FH\\^FDSupervisor:^FS" +
							 "^FT760,390^AAB,36,20^FH\\^FDWWW.DUSA.COM.VE^FS" +
							 "^BY3,3,47^FT438,1203^BCB,,Y,N" +
							 "^FD>;12345678^FS" +
							 "^BY2,3,40^FT559,1203^BCB,,Y,N" +
							 "^FD>;98765432>61^FS" +
							 "^FT333,127^A0B,28,28^FH\\^FDkg^FS" +
							 "^FT172,230^AAB,27,15^FH\\^FDA^FS" +
							 "^PQ1,0,1,Y^XZ";
					 		

					 		
			 
			 
		    /* String printer = "ZDesigner ZT230-200dpi ZPL";  // This should match your printer name from Step 2
		     PrintService ps = PrintServiceMatcher.findPrinter(printer);
		     if (ps != null) {
		        PrintRaw p = new PrintRaw(ps, rawCmds);
		         p.print();
		     }
		     else {
		       System.err.println("Could not find printer!");
		     }*/
			 
			 
			 PrintService[] services = PrinterJob.lookupPrintServices();
			 
			 
			/* PrintService[] printServices = PrintServiceLookup.lookupPrintServices(null, null);
		        System.out.println("Number of print services: " + printServices.length); */

		        String impresoras="";
		        
		        for (PrintService printer : services)
		        	impresoras=impresoras + printer.getName();
		            //System.out.println("Printer: " + ); 
			 
		        hai.setValue("");
		        hai.setValue(impresoras);
		    
		  }
		  catch (Exception e) {
		     e.printStackTrace();
		  }
		  
		 
		
		System.out.println("FER");
		
	}

	
}
