
solution {
    puzzle = "P025"
    name = "W3.5 6T"
    arm(ARM1) {
        number = 1
        position = -2 to 1
        rotation = -1
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = -2 to -4
        rotation = 7
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 1 to 0
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 0 to -2
        rotation = 7
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = -1 to 2
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 0 to 1
        rotation = -2
        size = 2
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 3
    }
    glyph(CALCIFICATION) {
        position = -1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to -2
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = 0 to -1
        rotation = 0
    }
    track {
        position = -3 to -4
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = -3 to 0
        positions = listOf(0 to 0, 1 to 0, 1 to 1, 2 to 1, 3 to 1, 4 to 0, 4 to -1)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(8)
                repeat()
                wait(8)
                repeat()
                wait(8)
                repeat()
                wait(8)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(6)
                grab()
                pivotClockwise()
                pivotClockwise()
                retract()
                back()
                reset()
                wait(3)
                repeat()
                wait(8)
                repeat()
                wait(8)
                repeat()
                wait(8)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(1)
                grab()
                forward()
                reset()
                wait(2)
                grab()
                forward()
                reset()
                wait(1)
                repeat()
                wait(8)
                repeat()
                wait(8)
                repeat()
                wait(8)
                repeat()
                wait(8)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                back()
                reset()
                wait(7)
                repeat()
                wait(8)
                repeat()
                wait(8)
                repeat()
                wait(8)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(2)
                repeat()
                wait(8)
                repeat()
                wait(8)
                repeat()
                wait(8)
                repeat()
                wait(8)
                grab()
                rotateClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                extend()
                reset()
                wait(6)
                repeat()
                wait(8)
                repeat()
                wait(8)
                repeat()
                wait(8)
                repeat()
                wait(8)
                grab()
                extend()
                reset()
            }
        }
        )
    }
}
