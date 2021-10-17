
solution {
    puzzle = "P036"
    name = "TI???"
    arm(ARM6) {
        number = 1
        position = -1 to -1
        rotation = 2
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -4 to 1
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -2 to 2
        rotation = 5
        size = 1
    }
    glyph(PURIFICATION) {
        position = -1 to 1
        rotation = 3
    }
    glyph(PURIFICATION) {
        position = -2 to -1
        rotation = -5
    }
    glyph(PURIFICATION) {
        position = -4 to 2
        rotation = 5
    }
    io(INPUT) {
        index = 0
        position = -1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 0 to -1
        rotation = 0
    }
    tape {
        parallel(
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
                wait(3)
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
                rotateClockwise()
                rotateClockwise()
            }
        }
        )
    }
}
