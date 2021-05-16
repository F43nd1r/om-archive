
solution {
    puzzle = "P107"
    name = "TI 12"
    arm(ARM6) {
        number = 1
        position = -6 to 0
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -2 to 2
        rotation = -2
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = -4 to -5
        rotation = -4
        size = 2
    }
    glyph(BONDER) {
        position = -3 to -3
        rotation = -3
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -4 to 0
        rotation = -5
    }
    glyph(UNBONDER) {
        position = -3 to -1
        rotation = -5
    }
    glyph(UNBONDER) {
        position = -6 to 4
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -7 to 4
        rotation = 4
    }
    io(INPUT) {
        index = 0
        position = -9 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -7 to -2
        rotation = 2
    }
    tape {
        parallel(
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
            sequence(2) {
                wait(3)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                pivotClockwise()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
