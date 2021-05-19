
solution {
    puzzle = "P039"
    name = "WHY WASNT THIS OBVIOUS? 6T "
    arm(PISTON) {
        number = 1
        position = -3 to 1
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -4 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -3 to -1
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 4
        position = -3 to 0
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -3 to -2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -4 to -2
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 7
        position = -2 to 1
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 8
        position = -2 to -2
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 9
        position = -1 to 1
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 4
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = 4
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 6
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = 5
    }
    glyph(UNBONDER) {
        position = 3 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 0
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 4 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -1 to -1
        rotation = 0
    }
    track {
        position = -4 to -1
        positions = listOf(0 to 0, 1 to 0, 0 to 1)
    }
    track {
        position = -4 to -2
        positions = listOf(-1 to 1, 0 to 0, 1 to 0)
    }
    track {
        position = 1 to 1
        positions = listOf(-2 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(2)
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                back()
                grab()
                forward()
                drop()
                wait(2)
                back()
                grab()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                wait(1)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                reset()
                wait(1)
                repeat()
                wait(7)
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
            sequence(3) {
                wait(4)
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                wait(2)
                forward()
                wait(1)
                back()
            }
        }
        , 
        {
            sequence(9) {
                wait(6)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                grab()
                forward()
                extend()
                extend()
                back()
                retract()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                extend()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                retract()
                wait(1)
                extend()
                drop()
                wait(2)
                grab()
                retract()
                wait(1)
                extend()
                drop()
                wait(3)
                grab()
                retract()
                wait(1)
                extend()
                drop()
                wait(3)
                grab()
                retract()
                wait(1)
                extend()
                drop()
                wait(3)
                grab()
                retract()
                wait(1)
                extend()
                drop()
                wait(3)
                grab()
                retract()
                wait(1)
                extend()
                drop()
                wait(3)
                grab()
                retract()
                wait(1)
                extend()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                reset()
                wait(1)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                grab()
                forward()
                drop()
                back()
                wait(2)
                grab()
                forward()
                drop()
                back()
            }
        }
        , 
        {
            sequence(6) {
                wait(1)
                grab()
                back()
                wait(1)
                forward()
                drop()
                back()
                wait(1)
                forward()
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                repeat()
                wait(7)
                grab()
                back()
                wait(1)
                forward()
                drop()
                wait(2)
                back()
                wait(1)
                forward()
                wait(5)
                extendTape()
            }
        }
        , 
        {
            sequence(8) {
                wait(5)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                reset()
                wait(1)
                repeat()
                wait(7)
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
                drop()
                retract()
                wait(2)
                grab()
                extend()
                drop()
                retract()
            }
        }
        )
    }
}
