
solution {
    puzzle = "P036"
    name = "?? (Copy) (Copy)"
    arm(ARM6) {
        number = 1
        position = 0 to 2
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -3 to 4
        rotation = -11
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -4 to 2
        rotation = 2
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = -2 to 1
        rotation = 2
        size = 1
    }
    glyph(PURIFICATION) {
        position = -2 to 4
        rotation = -38
    }
    glyph(PURIFICATION) {
        position = 0 to 1
        rotation = -28
    }
    glyph(PURIFICATION) {
        position = -3 to 2
        rotation = -24
    }
    io(INPUT) {
        index = 0
        position = 1 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to 5
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
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
                wait(2)
                extendTape()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
