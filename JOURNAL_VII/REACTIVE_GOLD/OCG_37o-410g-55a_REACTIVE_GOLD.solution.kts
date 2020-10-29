
solution {
    puzzle = "P095"
    name = "OVERLAP A"
    arm(ARM1) {
        number = 1
        position = -1 to -2
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -1 to 3
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 1 to -1
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 0 to -3
        rotation = -5
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 3
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to 0
        rotation = 3
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = -2
    }
    glyph(BONDER) {
        position = -2 to 2
        rotation = -2
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to 2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -1 to 1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -2 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -1 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to -2
        rotation = 2
    }
    glyph(PROJECTION) {
        position = -1 to 1
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -1 to 1
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 2
        rotation = -2
    }
    track {
        position = -1 to 7
        positions = listOf(-1 to -3, -1 to -2, 0 to -3, 0 to -4)
    }
    track {
        position = 1 to 0
        positions = listOf(28 to 0, 27 to 0, 26 to 0, 25 to 0, 24 to 0, 23 to 0, 22 to 0, 21 to 0, 20 to 0, 19 to 0, 18 to 0, 17 to 0, 16 to 0, 15 to 0, 14 to 0, 13 to 0, 12 to 0, 11 to 0, 10 to 0, 9 to 0, 8 to 0, 7 to 0, 6 to 0, 5 to 0, 4 to 0, 3 to 0, 2 to 0, 1 to 0, 0 to 0, 0 to -1)
    }
    track {
        position = -1 to -6
        positions = listOf(-1 to 5, -1 to 4, 0 to 3, 0 to 4)
    }
    track {
        position = 0 to -3
        positions = listOf(0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                wait(5)
                pivotCounterClockwise()
                wait(4)
                pivotCounterClockwise()
                wait(4)
                pivotCounterClockwise()
                wait(4)
                pivotCounterClockwise()
                wait(4)
                back()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
                back()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                wait(4)
                pivotClockwise()
                wait(4)
                pivotClockwise()
                wait(4)
                pivotClockwise()
                wait(4)
                pivotClockwise()
                wait(4)
                back()
                drop()
                wait(3)
                extendTape()
            }
        }
        , 
        {
            sequence(4) {
                wait(14)
                grab()
                rotateCounterClockwise()
                forward()
                forward()
                drop()
                back()
            }
        }
        )
    }
}
