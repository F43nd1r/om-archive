
solution {
    puzzle = "P058"
    name = "OVERLAP AX"
    arm(ARM1) {
        number = 1
        position = -1 to -2
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -1 to -1
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = -2 to 1
        rotation = 5
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = -4 to 2
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = -2 to 3
        rotation = 5
        size = 3
    }
    arm(PISTON) {
        number = 6
        position = 0 to -1
        rotation = 2
        size = 1
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
        position = 0 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to 1
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
        position = 0 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to -1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 2 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 2 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to -1
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
        position = 3 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -6 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 1
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
        position = 2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 1 to 0
        rotation = 0
    }
    track {
        position = -1 to -3
        positions = listOf(0 to 2, -1 to 2, -2 to 2, -2 to 1, -1 to 1, 0 to 0, 0 to 1)
    }
    track {
        position = -2 to 3
        positions = listOf(0 to 0, 1 to 0, 1 to -1, 0 to -1)
    }
    track {
        position = 0 to 1
        positions = listOf(0 to 0, 0 to -1, 0 to -2)
    }
    track {
        position = -4 to 2
        positions = listOf(0 to 0, 1 to 0, 2 to -1, 2 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
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
            }
        }
        , 
        {
            sequence(4) {
                grab()
                forward()
                forward()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                wait(7)
                forward()
                grab()
                extend()
                retract()
                back()
                back()
                extend()
                pivotCounterClockwise()
                extend()
                forward()
                drop()
                retract()
                back()
                back()
                rotateClockwise()
                wait(5)
                back()
                back()
                grab()
                retract()
                forward()
                rotateCounterClockwise()
                extend()
                retract()
                back()
                back()
                extend()
                pivotCounterClockwise()
                extend()
                drop()
            }
        }
        , 
        {
            sequence(1) {
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
            sequence(3) {
                grab()
                forward()
                back()
                back()
                extend()
                pivotCounterClockwise()
                extend()
                forward()
                drop()
                back()
                back()
                retract()
                retract()
                wait(6)
                back()
                wait(3)
                grab()
                extend()
                retract()
                back()
                back()
                extend()
                pivotCounterClockwise()
                extend()
                forward()
                drop()
                retract()
                back()
                back()
                rotateClockwise()
                extend()
                wait(4)
                back()
                rotateClockwise()
                grab()
                retract()
                wait(1)
                extend()
                wait(1)
                extendTape()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                retract()
                drop()
                retract()
                back()
                wait(2)
                grab()
                extend()
                retract()
                back()
                back()
                extend()
                pivotCounterClockwise()
                extend()
                forward()
                drop()
                retract()
                back()
                back()
                retract()
                wait(6)
                back()
                wait(3)
                grab()
                extend()
                retract()
                back()
                back()
                extend()
                pivotCounterClockwise()
                extend()
                forward()
                drop()
                retract()
                back()
                back()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                back()
                reset()
                wait(5)
                repeat()
                wait(6)
                repeat()
                wait(6)
                repeat()
                wait(5)
                rotateCounterClockwise()
                back()
                grab()
                back()
                extend()
                extend()
                drop()
                forward()
                forward()
                retract()
                retract()
                back()
                grab()
                back()
                rotateCounterClockwise()
                forward()
            }
        }
        )
    }
}
