
solution {
    puzzle = "P057"
    name = "OVERLAP A"
    arm(PISTON) {
        number = 1
        position = 3 to 1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -1 to 1
        rotation = 6
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 0 to 2
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 2 to -2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 5 to -2
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 3 to -1
        rotation = 5
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 5 to -3
        rotation = -1
    }
    glyph(BONDER) {
        position = 5 to -2
        rotation = -2
    }
    glyph(BONDER) {
        position = 6 to -2
        rotation = -3
    }
    glyph(BONDER) {
        position = 3 to 1
        rotation = 3
    }
    glyph(BONDER) {
        position = 2 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = 2
    }
    glyph(BONDER) {
        position = 3 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to 2
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 1 to 2
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -2 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 6 to -3
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 5 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 2 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 5 to -1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 5 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 3 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = 2 to 0
        rotation = 0
    }
    track {
        position = 0 to 3
        positions = listOf(-2 to 1, -1 to 1, 0 to 0, 0 to -1)
    }
    track {
        position = -2 to 2
        positions = listOf(0 to 0, 1 to -1)
    }
    track {
        position = 4 to 0
        positions = listOf(1 to 0, 0 to 0, -1 to 1)
    }
    track {
        position = 4 to 0
        positions = listOf(0 to 0, 0 to -1, -1 to -1)
    }
    track {
        position = -1 to -2
        positions = listOf(3 to 0, 3 to -1, 2 to 0)
    }
    track {
        position = 6 to -5
        positions = listOf(0 to 0, 0 to 1, 0 to 2, -1 to 3)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(4)
                grab()
                back()
                back()
                back()
                wait(1)
                forward()
                forward()
                rotateCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                wait(6)
                back()
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                back()
                wait(2)
                retract()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                extendTape()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                grab()
                back()
                wait(1)
                back()
                wait(2)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                rotateClockwise()
                drop()
                back()
                rotateClockwise()
                back()
                wait(1)
                grab()
                rotateClockwise()
                back()
                forward()
                back()
                forward()
                back()
                forward()
                back()
                forward()
                back()
                forward()
                back()
                forward()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                grab()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                forward()
                back()
                wait(1)
                forward()
                back()
            }
        }
        )
    }
}
