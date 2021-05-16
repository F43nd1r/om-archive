
solution {
    puzzle = "P107"
    name = "NEW SOLUTION 2 (Copy)"
    arm(ARM3) {
        number = 1
        position = -2 to 2
        rotation = 2
        size = 2
    }
    arm(ARM3) {
        number = 2
        position = -5 to -1
        rotation = 1
        size = 3
    }
    arm(ARM3) {
        number = 3
        position = 2 to 1
        rotation = -4
        size = 2
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 2
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -4 to 1
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -4 to 2
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = -4 to 4
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = 4 to 0
        rotation = -2
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
                wait(2)
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
