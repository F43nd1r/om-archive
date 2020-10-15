
solution {
    puzzle = "P060"
    name = "W3.5 6T"
    arm(ARM1) {
        number = 1
        position = 3 to 8
        rotation = -2
        size = 3
    }
    arm(PISTON) {
        number = 2
        position = 3 to 6
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 3 to 7
        rotation = -2
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = 3 to 3
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 1 to 6
        rotation = -2
        size = 3
    }
    arm(PISTON) {
        number = 6
        position = -2 to 0
        rotation = -5
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -3 to 0
        rotation = -5
        size = 1
    }
    glyph(BONDER) {
        position = 3 to 4
        rotation = -4
    }
    glyph(BONDER) {
        position = 2 to 3
        rotation = -2
    }
    glyph(BONDER) {
        position = -1 to 4
        rotation = -6
    }
    glyph(MULTI_BONDER) {
        position = 1 to 4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to 1
        rotation = -3
    }
    glyph(CALCIFICATION) {
        position = 4 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 6
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to 2
        rotation = -4
    }
    io(INPUT) {
        index = 1
        position = 3 to 5
        rotation = 0
    }
    track {
        position = 0 to 0
        positions = listOf(-1 to 0, -2 to 0, -3 to 0)
    }
    track {
        position = 2 to 7
        positions = listOf(-1 to -2, -1 to -1, 0 to -1, 1 to -1, 0 to 0, 1 to 0, 2 to 0, 1 to 1)
    }
    tape {
        parallel(
        {
            sequence(7) {
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                reset()
                wait(7)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(7)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(7)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(8)
                grab()
                rotateCounterClockwise()
                reset()
                wait(19)
                rotateClockwise()
                rotateClockwise()
                wait(6)
                grab()
                back()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                retract()
                extend()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                wait(3)
                reset()
                wait(1)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                grab()
                retract()
                extend()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                wait(2)
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                wait(4)
                back()
                reset()
                wait(4)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                grab()
                pivotClockwise()
                retract()
                drop()
                grab()
                pivotClockwise()
                extend()
                reset()
                wait(4)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(13)
                grab()
                back()
                reset()
                wait(9)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(7)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                back()
                extend()
                reset()
                wait(3)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
            }
        }
        )
    }
}
