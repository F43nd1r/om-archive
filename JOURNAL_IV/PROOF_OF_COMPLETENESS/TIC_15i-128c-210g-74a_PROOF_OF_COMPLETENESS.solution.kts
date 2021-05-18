
solution {
    puzzle = "P069"
    name = "NEW SOLUTION 3"
    arm(ARM3) {
        number = 1
        position = 1 to -3
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -1 to -1
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = 2 to -1
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = 3 to 1
        rotation = 2
        size = 2
    }
    arm(ARM6) {
        number = 5
        position = -4 to 1
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = 5
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 4
    }
    glyph(CALCIFICATION) {
        position = 1 to 3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to 3
        rotation = 0
    }
    glyph(DISPERSION) {
        position = 1 to -2
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = 2 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 4 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 4 to 0
        rotation = -1
    }
    io(OUTPUT) {
        index = 2
        position = -4 to 0
        rotation = 4
    }
    io(OUTPUT) {
        index = 3
        position = -5 to 1
        rotation = -3
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
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
                wait(3)
                grab()
                rotateClockwise()
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
                extendTape()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
