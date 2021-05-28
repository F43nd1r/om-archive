
solution {
    puzzle = "w1611998067"
    name = "NEW SOLUTION 1"
    arm(ARM2) {
        number = 1
        position = -6 to -10
        rotation = 4
        size = 1
    }
    arm(ARM2) {
        number = 2
        position = -11 to -9
        rotation = -1
        size = 2
    }
    arm(ARM6) {
        number = 3
        position = -6 to -8
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -5 to -9
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -8 to -7
        rotation = 3
    }
    glyph(BONDER) {
        position = -5 to -8
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -8 to -9
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -6 to -9
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = -5 to -12
        rotation = 4
    }
    io(OUTPUT) {
        index = 0
        position = -4 to -8
        rotation = 1
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                pivotClockwise()
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
                wait(4)
                grab()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
