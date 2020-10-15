
solution {
    puzzle = "P069"
    name = "W2.5 6T"
    arm(PISTON) {
        number = 1
        position = -2 to 0
        rotation = -8
        size = 3
    }
    arm(PISTON) {
        number = 2
        position = 0 to -1
        rotation = -9
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = -1 to 1
        rotation = -8
        size = 3
    }
    arm(PISTON) {
        number = 4
        position = 0 to 2
        rotation = -8
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 1 to 3
        rotation = -8
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -4 to -2
        rotation = -6
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = -3 to -4
        rotation = -11
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -4 to -5
        rotation = -5
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = -6 to -6
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -8
    }
    glyph(BONDER) {
        position = -3 to -3
        rotation = -9
    }
    glyph(CALCIFICATION) {
        position = 1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to -4
        rotation = 0
    }
    glyph(DISPERSION) {
        position = -2 to -2
        rotation = -9
    }
    io(INPUT) {
        index = 0
        position = -2 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 1
        rotation = -9
    }
    io(OUTPUT) {
        index = 1
        position = 2 to 1
        rotation = -5
    }
    io(OUTPUT) {
        index = 2
        position = -5 to -4
        rotation = 1
    }
    io(OUTPUT) {
        index = 3
        position = -6 to -5
        rotation = -5
    }
    track {
        position = 2 to 2
        positions = listOf(0 to 1, -1 to 1, -1 to 0, -2 to 0)
    }
    track {
        position = -5 to -5
        positions = listOf(-1 to -1, 0 to -1, 0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                reset()
                wait(7)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(10)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                drop()
                retract()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                retract()
                retract()
                reset()
                wait(6)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(9)
                grab()
                retract()
                retract()
                reset()
                wait(4)
                grab()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                retract()
                rotateClockwise()
                reset()
                wait(2)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                grab()
                retract()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(3)
                grab()
                retract()
                retract()
                reset()
                wait(2)
                grab()
                retract()
                retract()
                rotateCounterClockwise()
                reset()
                wait(3)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(10)
                forward()
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(8)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(6)
                grab()
                back()
                back()
                reset()
                wait(3)
                grab()
                back()
                reset()
                wait(4)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(4)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(7)
                grab()
                back()
                retract()
                reset()
                wait(3)
                grab()
                back()
                retract()
                reset()
                wait(3)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(12)
                grab()
                back()
                retract()
                reset()
                wait(2)
                grab()
                back()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(17)
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(9)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(13)
                repeat()
                wait(5)
                repeat()
            }
        }
        )
    }
}
