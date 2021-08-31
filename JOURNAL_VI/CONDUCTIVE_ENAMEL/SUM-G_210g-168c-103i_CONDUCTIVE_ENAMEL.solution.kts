
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
        position = 1 to -1
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 0 to -1
        rotation = 2
        size = 2
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
        position = -1 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 10 to 1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 0 to 0
        rotation = -3
    }
    io(OUTPUT) {
        index = 0
        position = 8 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to 1
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = -1 to -1
        rotation = 0
    }
    track {
        position = 9 to -2
        positions = listOf(0 to 0, 1 to 0, 2 to 0)
    }
    track {
        position = 1 to -1
        positions = listOf(0 to 0, 0 to -1, -1 to 0)
    }
    conduit {
        id = 100
        position = 11 to -1
        rotation = 0
        positions = listOf(0 to 0)
    }
    conduit {
        id = 100
        position = -2 to 1
        rotation = 0
        positions = listOf(0 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
                repeat()
                wait(2)
                repeat()
                wait(2)
                repeat()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                back()
                back()
                reset()
                wait(2)
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
            sequence(5) {
                wait(9)
                grab()
                retract()
                pivotClockwise()
                retract()
                reset()
                wait(2)
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
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                wait(1)
                grab()
                back()
                drop()
                back()
                back()
                wait(1)
                grab()
                back()
                drop()
                back()
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                forward()
                grab()
                back()
                drop()
                back()
                back()
                wait(1)
                grab()
                back()
                drop()
                back()
                back()
                wait(3)
                grab()
                forward()
                wait(5)
                forward()
                drop()
            }
        }
        )
    }
}
