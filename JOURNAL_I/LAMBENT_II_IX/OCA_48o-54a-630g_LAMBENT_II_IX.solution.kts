
solution {
    puzzle = "P058"
    name = "OVERLAP AX"
    arm(PISTON) {
        number = 1
        position = -4 to 2
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to -2
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -1 to -1
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = 1 to -2
        rotation = 2
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = 2 to -3
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 0 to 2
        rotation = 5
        size = 2
    }
    glyph(BONDER) {
        position = -3 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -5 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -4 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -4 to 1
        rotation = -2
    }
    glyph(BONDER) {
        position = -4 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = -5 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -6 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = -5 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 3 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to 1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -4 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -4 to 0
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -6 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -5 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -6 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 4 to -1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 3 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 3 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to 0
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -6 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -6 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 5 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -5 to 0
        rotation = -2
    }
    io(INPUT) {
        index = 1
        position = -4 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 3 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 2 to 0
        rotation = 0
    }
    track {
        position = -2 to 0
        positions = listOf(2 to 2, 1 to 2, 0 to 2, 1 to 1, 0 to 1, -1 to 2, -2 to 2)
    }
    track {
        position = -1 to -3
        positions = listOf(0 to 2, -1 to 2, -2 to 2, -2 to 1, -1 to 1, 0 to 0, 0 to 1)
    }
    track {
        position = 0 to -1
        positions = listOf(2 to -2, 3 to -2, 2 to -1, 1 to 0, 0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(6)
                back()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                back()
                back()
                drop()
                back()
                back()
                back()
                wait(1)
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                back()
                back()
                drop()
                back()
                back()
                back()
                wait(1)
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                back()
                drop()
                back()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                back()
                back()
                back()
                drop()
                back()
                back()
                back()
                wait(1)
                back()
                reset()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                back()
                back()
                drop()
                back()
                back()
                back()
                wait(1)
                back()
                reset()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                back()
                back()
                drop()
                back()
                back()
                back()
                wait(1)
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                back()
                extend()
                drop()
                forward()
                retract()
                rotateCounterClockwise()
                wait(22)
                rotateClockwise()
                back()
                back()
                grab()
                rotateClockwise()
                back()
                extend()
                drop()
                wait(2)
                forward()
                forward()
                forward()
                grab()
                retract()
                wait(2)
                forward()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateClockwise()
                back()
                back()
                extend()
                back()
                pivotCounterClockwise()
                back()
                retract()
                reset()
                wait(3)
                grab()
                back()
                rotateClockwise()
                forward()
                back()
                back()
                extend()
                back()
                pivotCounterClockwise()
                back()
                retract()
                reset()
                wait(4)
                grab()
                back()
                rotateClockwise()
                forward()
                back()
                back()
                extend()
                back()
                pivotCounterClockwise()
                back()
                retract()
                reset()
                wait(4)
                grab()
                rotateClockwise()
                retract()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                extend()
                reset()
                wait(1)
                back()
                grab()
                back()
                rotateClockwise()
                wait(2)
                back()
                extend()
                back()
                pivotCounterClockwise()
                back()
                retract()
                reset()
                wait(3)
                back()
                grab()
                back()
                rotateClockwise()
                forward()
                back()
                back()
                extend()
                back()
                pivotCounterClockwise()
                back()
                retract()
                reset()
                wait(3)
                back()
                grab()
                back()
                rotateClockwise()
                forward()
                back()
                back()
                extend()
                back()
                pivotCounterClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                rotateCounterClockwise()
                forward()
                forward()
                wait(5)
                forward()
                reset()
            }
        }
        )
    }
}
