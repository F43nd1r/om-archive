
solution {
    puzzle = "P064"
    name = "OVERLAP A (Copy)"
    arm(ARM1) {
        number = 1
        position = -1 to 0
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -1 to 1
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -1 to 2
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 1 to -5
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 4 to -5
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -1 to -3
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 1 to -4
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = 2 to 1
        rotation = -2
        size = 2
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = -2
    }
    glyph(BONDER) {
        position = 3 to -4
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 2 to -1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to -2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -1 to -3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to -3
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -4 to 0
        rotation = 5
    }
    glyph(PROJECTION) {
        position = 3 to -3
        rotation = 2
    }
    glyph(PROJECTION) {
        position = -1 to -2
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 3 to -4
        rotation = 2
    }
    glyph(PROJECTION) {
        position = 0 to -3
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -2 to -2
        rotation = 2
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 3 to -4
        rotation = 0
    }
    track {
        position = -2 to 1
        positions = listOf(1 to -2, 0 to -1, 0 to 0, 1 to 0, 1 to 1, 2 to 1, 3 to 1, 4 to 0)
    }
    track {
        position = -1 to -4
        positions = listOf(0 to 0, 0 to 1, 1 to 1, 2 to 0)
    }
    track {
        position = 4 to -5
        positions = listOf(0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(5) {
                grab()
                rotateClockwise()
                pivotClockwise()
                forward()
                pivotClockwise()
                back()
                wait(1)
                forward()
                wait(1)
                pivotClockwise()
                back()
                wait(1)
                pivotClockwise()
                forward()
                wait(1)
                pivotClockwise()
                back()
                wait(1)
                pivotClockwise()
                forward()
                wait(1)
                pivotClockwise()
                back()
                wait(1)
                pivotClockwise()
                forward()
                wait(1)
                pivotClockwise()
                back()
                wait(1)
                pivotClockwise()
                forward()
                wait(1)
                pivotClockwise()
                back()
                wait(1)
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                back()
                back()
                wait(2)
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(3)
                forward()
                back()
                wait(10)
                forward()
                wait(2)
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                back()
                pivotClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                wait(2)
                pivotClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                back()
                wait(1)
                back()
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                wait(3)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                forward()
                wait(1)
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                pivotClockwise()
                wait(6)
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(2)
                pivotClockwise()
                pivotClockwise()
                wait(2)
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(6)
                grab()
                back()
                rotateClockwise()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                drop()
                forward()
                forward()
                wait(17)
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(9)
                grab()
                wait(1)
                drop()
                wait(3)
                grab()
                wait(1)
                drop()
                wait(3)
                grab()
                wait(1)
                drop()
                wait(3)
                grab()
                wait(1)
                reset()
                back()
                grab()
                forward()
                pivotClockwise()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                wait(3)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                wait(3)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
