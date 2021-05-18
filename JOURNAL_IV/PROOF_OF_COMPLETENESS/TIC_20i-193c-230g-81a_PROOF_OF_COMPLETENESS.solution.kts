
solution {
    puzzle = "P069"
    name = "NEW SOLUTION 1"
    arm(ARM2) {
        number = 1
        position = -2 to -1
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -2 to 1
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = 1 to -2
        rotation = 0
        size = 1
    }
    arm(ARM3) {
        number = 4
        position = 2 to 1
        rotation = 1
        size = 3
    }
    arm(ARM3) {
        number = 5
        position = 1 to 2
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 2 to 0
        rotation = 4
        size = 3
    }
    glyph(BONDER) {
        position = -2 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 2 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 2
        rotation = 0
    }
    glyph(DISPERSION) {
        position = -1 to -1
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 3 to -3
        rotation = -3
    }
    io(OUTPUT) {
        index = 2
        position = -3 to 3
        rotation = 4
    }
    io(OUTPUT) {
        index = 3
        position = -3 to 0
        rotation = -3
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
                pivotClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                extendTape()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(6)
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        )
    }
}
