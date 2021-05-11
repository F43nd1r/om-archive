
solution {
    puzzle = "P067"
    name = "NEW SOLUTION 2 (REGULAR VERSION)"
    arm(ARM1) {
        number = 1
        position = -3 to -4
        rotation = 7
        size = 3
    }
    arm(ARM6) {
        number = 2
        position = -3 to 2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 3 to -1
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 1 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 2 to 0
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 0 to -2
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to -3
        rotation = -12
    }
    glyph(BONDER) {
        position = -2 to -2
        rotation = -11
    }
    glyph(MULTI_BONDER) {
        position = 0 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to -2
        rotation = -6
    }
    glyph(UNBONDER) {
        position = -3 to 1
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 2 to -4
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -2 to 1
        rotation = -1
    }
    glyph(PROJECTION) {
        position = -2 to 2
        rotation = -1
    }
    io(INFINITE) {
        index = 0
        position = 2 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 5 to -3
        rotation = -9
    }
    io(OUTPUT) {
        index = 1
        position = 0 to -3
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -4 to 0
        rotation = 16
    }
    track {
        position = -1 to -1
        positions = listOf(0 to 0, 1 to -1)
    }
    track {
        position = 1 to -1
        positions = listOf(0 to 1, 1 to 1, 1 to 0)
    }
    track {
        position = 3 to 0
        positions = listOf(1 to -1, 0 to 0, 0 to -1)
    }
    track {
        position = -3 to -4
        positions = listOf(0 to 1, 0 to 0)
    }
    tape {
        parallel(
        {
            sequence(6) {
                wait(12)
                grab()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                wait(9)
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                rotateCounterClockwise()
                wait(4)
                rotateClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                back()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                back()
                pivotClockwise()
                pivotClockwise()
                forward()
                back()
                pivotClockwise()
                pivotClockwise()
                forward()
                back()
                wait(1)
                back()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                back()
                pivotClockwise()
                pivotClockwise()
                forward()
                back()
                pivotClockwise()
                pivotClockwise()
                forward()
                back()
                back()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(4) {
                wait(10)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(6)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(5) {
                wait(16)
                forward()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                forward()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(13)
                back()
                grab()
                back()
                back()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                wait(12)
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                wait(6)
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                wait(1)
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
