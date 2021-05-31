
solution {
    puzzle = "w2450512434"
    name = "H2"
    arm(PISTON) {
        number = 1
        position = -9 to 1
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = -4 to 0
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -2 to 0
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -7 to 1
        rotation = 4
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = -13 to 0
        rotation = 6
        size = 3
    }
    arm(PISTON) {
        number = 6
        position = -16 to 1
        rotation = 6
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -18 to 1
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = -4 to 1
        rotation = 3
    }
    glyph(BONDER) {
        position = -15 to 0
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -12 to 0
        rotation = 8
    }
    glyph(UNBONDER) {
        position = -9 to 0
        rotation = 8
    }
    glyph(UNBONDER) {
        position = -7 to 0
        rotation = 3
    }
    glyph(PURIFICATION) {
        position = -6 to 1
        rotation = 4
    }
    glyph(PURIFICATION) {
        position = -14 to 0
        rotation = 7
    }
    io(INPUT) {
        index = 0
        position = -10 to 0
        rotation = 3
    }
    io(INFINITE) {
        index = 0
        position = -3 to 1
        rotation = 0
    }
    io(INFINITE) {
        index = 1
        position = -29 to 0
        rotation = 0
    }
    track {
        position = -9 to 1
        positions = listOf(0 to 0, 1 to 0, 2 to 0)
    }
    track {
        position = -16 to 1
        positions = listOf(0 to 0, -1 to 0, -2 to 0, -3 to 0, -4 to 0)
    }
    track {
        position = -4 to 0
        positions = listOf(0 to 0, 1 to 0, 2 to 0, 3 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                extend()
                retract()
                forward()
                pivotCounterClockwise()
                drop()
                retract()
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                reset()
                wait(1)
                repeat()
                wait(13)
                repeat()
                wait(13)
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
            sequence(2) {
                wait(12)
                grab()
                retract()
                retract()
                rotateClockwise()
                forward()
                reset()
                wait(6)
                grab()
                retract()
                retract()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                reset()
                wait(4)
                repeat()
                wait(27)
                repeat()
                wait(27)
                grab()
                retract()
                retract()
                rotateClockwise()
                forward()
                reset()
                wait(6)
                grab()
                retract()
                retract()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                forward()
                back()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(11)
                back()
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(8)
                back()
                grab()
                forward()
                rotateCounterClockwise()
                reset()
                wait(9)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                retract()
                retract()
                pivotCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(5)
                grab()
                retract()
                retract()
                pivotCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(6)
                repeat()
                wait(27)
                repeat()
                wait(27)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(9)
                grab()
                retract()
                retract()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                extend()
                extend()
                wait(4)
                grab()
                retract()
                retract()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                reset()
                wait(5)
                repeat()
                wait(27)
                repeat()
                wait(27)
                grab()
                retract()
                retract()
                rotateClockwise()
                forward()
                reset()
                wait(8)
                grab()
                retract()
                retract()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                forward()
                forward()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(114)
                grab()
                forward()
                drop()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(28)
                back()
                grab()
                forward()
                forward()
                reset()
                wait(23)
                repeat()
                wait(27)
                repeat()
                wait(28)
                grab()
                forward()
                forward()
                drop()
                wait(1)
                reset()
            }
        }
        )
    }
}
