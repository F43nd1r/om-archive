
solution {
    puzzle = "P036"
    name = "????"
    arm(ARM2) {
        number = 1
        position = -1 to -1
        rotation = -9
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -2 to 2
        rotation = -10
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -4 to 1
        rotation = 4
        size = 1
    }
    glyph(PURIFICATION) {
        position = -4 to 2
        rotation = -37
    }
    glyph(PURIFICATION) {
        position = -1 to 1
        rotation = -27
    }
    glyph(PURIFICATION) {
        position = -2 to -1
        rotation = -23
    }
    io(INPUT) {
        index = 0
        position = -5 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(3)
                grab()
                rotateClockwise()
                wait(1)
                drop()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateClockwise()
                drop()
                wait(3)
                extendTape()
            }
        }
        , 
        {
            sequence(1) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
            }
        }
        )
    }
}
