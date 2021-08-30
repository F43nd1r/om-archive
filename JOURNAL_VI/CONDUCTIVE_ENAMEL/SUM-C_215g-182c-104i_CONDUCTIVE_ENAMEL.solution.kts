
solution {
    puzzle = "P093"
    name = "SUM"
    arm(ARM6) {
        number = 1
        position = 1 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -2 to 0
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 3
        position = 0 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 11 to -2
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = 8 to -1
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = 9 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to 0
        rotation = 3
    }
    glyph(CALCIFICATION) {
        position = -1 to 1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 1 to -1
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = 8 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to 1
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = 1 to -2
        rotation = 0
    }
    track {
        position = 8 to -1
        positions = listOf(1 to -1, 2 to -1, 3 to -1)
    }
    conduit {
        id = 100
        position = 11 to -1
        rotation = 0
        positions = listOf(0 to 0)
    }
    conduit {
        id = 100
        position = -1 to -1
        rotation = 0
        positions = listOf(0 to 0)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(8)
                grab()
                back()
                back()
                reset()
                wait(4)
                grab()
                back()
                pivotClockwise()
                back()
                reset()
                wait(2)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                pivotClockwise()
                back()
                drop()
                wait(3)
                forward()
                forward()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                repeat()
                wait(3)
                repeat()
                wait(3)
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(5)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                grab()
                rotateClockwise()
                drop()
                grab()
                wait(1)
                reset()
                wait(4)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                rotateCounterClockwise()
                wait(12)
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(12)
                grab()
                retract()
                pivotClockwise()
                retract()
                reset()
                wait(3)
                grab()
                retract()
                pivotClockwise()
                retract()
                pivotClockwise()
                pivotCounterClockwise()
                reset()
                wait(3)
                grab()
                retract()
                pivotClockwise()
                retract()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
