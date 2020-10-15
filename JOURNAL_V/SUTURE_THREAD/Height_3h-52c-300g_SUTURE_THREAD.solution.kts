
solution {
    puzzle = "P085"
    name = "H3 6T"
    arm(PISTON) {
        number = 1
        position = -4 to 1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -3 to 0
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 3
        position = -3 to 1
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = -1 to -1
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = -2 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -5 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -5 to 1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -4 to 0
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = 5
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 3 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 0
        rotation = 0
    }
    track {
        position = 0 to 0
        positions = listOf(0 to -1, -1 to -1, -2 to -1)
    }
    track {
        position = -4 to 0
        positions = listOf(0 to 0, -1 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(3)
                grab()
                extend()
                pivotCounterClockwise()
                extend()
                pivotCounterClockwise()
                reset()
                wait(2)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                grab()
                extend()
                pivotCounterClockwise()
                wait(1)
                extend()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                back()
                drop()
                back()
                wait(1)
                back()
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(3)
                back()
                grab()
                back()
                drop()
                back()
                wait(1)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                back()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(3)
                back()
                wait(1)
                back()
                grab()
                back()
                drop()
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                back()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(2)
                back()
                wait(1)
                forward()
                wait(3)
                grab()
                extend()
                extend()
                drop()
                retract()
                retract()
                wait(2)
                grab()
                extend()
                extend()
                drop()
                retract()
                retract()
                wait(2)
                grab()
                extend()
                extend()
                drop()
                retract()
                retract()
                wait(2)
                grab()
                extend()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                extend()
                extend()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                extend()
                reset()
                wait(3)
                grab()
                extend()
                pivotCounterClockwise()
                reset()
                wait(4)
                grab()
                extend()
                pivotCounterClockwise()
                reset()
                wait(4)
                grab()
                extend()
                pivotCounterClockwise()
                reset()
                wait(4)
                grab()
                extend()
                pivotCounterClockwise()
                reset()
                wait(4)
                grab()
                extend()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                pivotClockwise()
                pivotClockwise()
                back()
                reset()
                wait(1)
                retract()
                wait(34)
                grab()
                extend()
                wait(1)
                back()
                reset()
            }
        }
        )
    }
}
