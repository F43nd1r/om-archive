
solution {
    puzzle = "P024"
    name = "NEW SOLUTION 3"
    arm(ARM2) {
        number = 1
        position = -10 to -3
        rotation = -3
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 2
        position = -12 to 2
        rotation = 3
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -8 to -2
        rotation = 0
        size = 1
    }
    glyph(UNBONDER) {
        position = -10 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -9 to -1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -12 to 1
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = -11 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -8 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -12 to -2
        rotation = -2
    }
    io(OUTPUT) {
        index = 1
        position = -9 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = -7 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 3
        position = -7 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                rotateClockwise()
            }
        }
        )
    }
}
