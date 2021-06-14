
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
        size = 1
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
        position = -7 to -6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to -6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to -7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to -8
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to -7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to -6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -5
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
        positions = listOf(2 to 1, 2 to 2)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                reset()
                wait(2)
                grab()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                back()
                reset()
                wait(1)
                grab()
                back()
                wait(1)
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                reset()
                wait(2)
                grab()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                reset()
                wait(4)
                grab()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                reset()
                wait(4)
                grab()
                back()
                back()
                rotateCounterClockwise()
                wait(16)
                extendTape()
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
                wait(2)
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                back()
                wait(1)
                grab()
                back()
                wait(3)
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                back()
                grab()
                back()
                wait(2)
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                back()
                wait(1)
                grab()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(4)
                back()
                wait(1)
                grab()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(4)
                back()
                wait(1)
                grab()
                back()
            }
        }
        , 
        {
            sequence(6) {
                wait(12)
                grab()
                back()
                back()
                rotateClockwise()
                reset()
                wait(7)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                reset()
                wait(5)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                back()
                drop()
            }
        }
        )
    }
}
