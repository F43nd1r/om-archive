
solution {
    puzzle = "P036"
    name = "HMMM"
    arm(ARM6) {
        number = 1
        position = -1 to -1
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -1 to 1
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = 1 to -1
        rotation = 2
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = 2 to 0
        rotation = -3
        size = 1
    }
    glyph(PURIFICATION) {
        position = -2 to 0
        rotation = 6
    }
    glyph(PURIFICATION) {
        position = 1 to -2
        rotation = 14
    }
    glyph(PURIFICATION) {
        position = 0 to 1
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = -2 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                wait(5)
                extendTape()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
