
solution {
    puzzle = "P024"
    name = "NEW SOLUTION 3"
    arm(ARM2) {
        number = 1
        position = 1 to -1
        rotation = -3
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 2
        position = -1 to 4
        rotation = 3
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = 3 to 0
        rotation = 0
        size = 1
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to 1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -1 to 3
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = 0 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 0
        rotation = -2
    }
    io(OUTPUT) {
        index = 1
        position = 2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = 4 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 3
        position = 4 to 0
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
            sequence(2) {
                rotateClockwise()
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
        )
    }
}
