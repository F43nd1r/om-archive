
solution {
    puzzle = "w2450508212"
    name = "W3 NOGIF"
    arm(ARM1) {
        number = 1
        position = -6 to -5
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -7 to -5
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -6 to -2
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -4 to -3
        rotation = 3
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = -3 to 0
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -8 to -6
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = -9 to -8
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = -8 to -5
        rotation = 1
    }
    glyph(BONDER) {
        position = -9 to -6
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = -4 to -2
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = -2 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -7 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -12 to -8
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -11 to -8
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -11 to -7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -10 to -7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -10 to -6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to -7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to -6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -5 to -4
        rotation = -3
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = 1
    }
    track {
        position = -7 to -3
        positions = listOf(0 to -2, 0 to -1, 1 to -2)
    }
    track {
        position = -5 to -3
        positions = listOf(0 to 2, 0 to 1, -1 to 1, 0 to 0, 1 to 0, 2 to 0)
    }
    track {
        position = -1 to 1
        positions = listOf(-1 to 0, -2 to 0, -2 to -1, -3 to -1)
    }
    track {
        position = -10 to -8
        positions = listOf(0 to 0, 1 to 0, 1 to 1, 2 to 1, 2 to 2)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                back()
                rotateCounterClockwise()
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
            sequence(6) {
                wait(4)
                grab()
                back()
                back()
                rotateClockwise()
                wait(6)
                reset()
                wait(3)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                pivotClockwise()
                drop()
                wait(3)
                reset()
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                pivotClockwise()
                drop()
                wait(2)
                reset()
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                pivotClockwise()
                drop()
                wait(2)
                reset()
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                pivotClockwise()
                reset()
                wait(25)
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(13)
                forward()
                grab()
                retract()
                back()
                rotateCounterClockwise()
                back()
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
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                back()
                back()
                pivotCounterClockwise()
                drop()
                forward()
                forward()
                reset()
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
                wait(4)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                reset()
                wait(2)
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
                back()
                wait(1)
                grab()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(3)
                back()
                wait(1)
                grab()
                back()
                back()
                rotateCounterClockwise()
                reset()
                wait(5)
                back()
                wait(1)
                grab()
                back()
                back()
                rotateCounterClockwise()
                reset()
                wait(5)
                back()
                wait(1)
                grab()
                back()
                back()
                rotateCounterClockwise()
                reset()
                wait(5)
                back()
                wait(1)
                grab()
                back()
                back()
                rotateCounterClockwise()
                reset()
                wait(5)
                back()
                wait(1)
                grab()
                back()
                back()
            }
        }
        , 
        {
            sequence(7) {
                wait(24)
                forward()
                grab()
                back()
                back()
                reset()
                wait(7)
                repeat()
                wait(10)
                repeat()
            }
        }
        )
    }
}
