
solution {
    puzzle = "P067"
    name = "TI?? (Copy) (Copy) (Copy)"
    arm(ARM6) {
        number = 1
        position = 13 to -14
        rotation = 2
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = 9 to -5
        rotation = 2
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = 6 to -8
        rotation = -1
        size = 3
    }
    arm(ARM6) {
        number = 4
        position = 14 to -10
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 16 to -12
        rotation = -6
        size = 1
    }
    arm(ARM3) {
        number = 6
        position = 13 to -12
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = 12 to -5
        rotation = -1
    }
    glyph(BONDER) {
        position = 14 to -18
        rotation = 0
    }
    glyph(BONDER) {
        position = 15 to -10
        rotation = -2
    }
    glyph(BONDER) {
        position = 15 to -9
        rotation = -3
    }
    glyph(BONDER) {
        position = 17 to -11
        rotation = -4
    }
    glyph(BONDER) {
        position = 17 to -10
        rotation = -5
    }
    glyph(BONDER) {
        position = 19 to -13
        rotation = -4
    }
    glyph(UNBONDER) {
        position = 13 to -9
        rotation = -3
    }
    glyph(UNBONDER) {
        position = 12 to -4
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 9 to -1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 10 to -15
        rotation = -5
    }
    glyph(UNBONDER) {
        position = 16 to -17
        rotation = -3
    }
    glyph(UNBONDER) {
        position = 18 to -11
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 12 to -8
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 13 to -11
        rotation = 1
    }
    glyph(PROJECTION) {
        position = 14 to -12
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 6 to -2
        rotation = -4
    }
    io(INFINITE) {
        index = 0
        position = 18 to -10
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 16 to -15
        rotation = -2
    }
    io(OUTPUT) {
        index = 1
        position = 9 to -8
        rotation = -3
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(10)
                grab()
                rotateClockwise()
                drop()
                wait(2)
                extendTape()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(12)
                grab()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
