
solution {
    puzzle = "P024"
    name = "TI"
    arm(ARM2) {
        number = 1
        position = -4 to -2
        rotation = 2
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -2 to -1
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = 0 to -1
        rotation = 0
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 4
        position = -2 to 1
        rotation = 1
        size = 1
    }
    glyph(UNBONDER) {
        position = -4 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to -2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -2 to 0
        rotation = 5
    }
    io(INPUT) {
        index = 0
        position = -5 to 0
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -3 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = 1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 3
        position = 1 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                rotateCounterClockwise()
            }
        }
        )
    }
}
