
solution {
    puzzle = "P029"
    name = "NEW SOLUTION 4 (Copy) (Copy) (Copy) (Copy) (Copy)"
    arm(ARM3) {
        number = 1
        position = 1 to -4
        rotation = 0
        size = 2
    }
    arm(ARM6) {
        number = 2
        position = 3 to -8
        rotation = 2
        size = 1
    }
    arm(ARM3) {
        number = 3
        position = -1 to -5
        rotation = 1
        size = 2
    }
    arm(ARM3) {
        number = 4
        position = -3 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 0 to -1
        rotation = 9
        size = 2
    }
    glyph(BONDER) {
        position = 1 to -5
        rotation = 4
    }
    glyph(BONDER) {
        position = -2 to -2
        rotation = 5
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 5
    }
    glyph(CALCIFICATION) {
        position = -2 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to -1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 3 to -7
        rotation = 7
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 2
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -3 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -7
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 3 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 4 to -8
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(1) {
                wait(1)
                grab()
                rotateClockwise()
                drop()
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
            sequence(2) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
