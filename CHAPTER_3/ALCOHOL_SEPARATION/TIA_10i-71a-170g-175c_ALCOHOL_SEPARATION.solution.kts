
solution {
    puzzle = "P024"
    name = "INSTRUCTIONS NO TRACK 12"
    arm(ARM1) {
        number = 1
        position = -4 to 0
        rotation = -1
        size = 3
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 2
        position = -3 to 1
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -1 to 2
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = 1 to 1
        rotation = -1
        size = 1
    }
    glyph(UNBONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to 0
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = -3 to 2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to -3
        rotation = 4
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 0 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = 1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 3
        position = -1 to 3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
