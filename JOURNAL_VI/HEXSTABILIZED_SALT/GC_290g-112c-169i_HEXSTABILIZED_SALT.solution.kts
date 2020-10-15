
solution {
    puzzle = "P091b"
    name = "B CGX 7T"
    arm(ARM1) {
        number = 1
        position = 0 to 3
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = 3 to 0
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = 3 to -1
        rotation = 3
        size = 2
    }
    arm(PISTON) {
        number = 4
        position = 0 to -3
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = -1 to -2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -3 to 0
        rotation = -6
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 2
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 1 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = 0
    }
    track {
        position = 2 to 0
        positions = listOf(1 to 0, 0 to 0, 0 to -1, 1 to -2, 1 to -1)
    }
    track {
        position = -1 to -2
        positions = listOf(0 to 0, -1 to 1, -2 to 2)
    }
    conduit {
        id = 100
        position = -3 to 3
        rotation = 0
    }
    conduit {
        id = 100
        position = -3 to 2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(7)
                grab()
                retract()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                back()
                wait(6)
                grab()
                rotateCounterClockwise()
                forward()
                wait(2)
                extend()
                pivotClockwise()
                pivotClockwise()
                extend()
                pivotClockwise()
                rotateClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
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
                wait(11)
                extendTape()
            }
        }
        , 
        {
            sequence(4) {
                wait(10)
                grab()
                retract()
                pivotClockwise()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                forward()
                grab()
                forward()
                forward()
                reset()
                wait(7)
                forward()
                grab()
                forward()
                forward()
                extend()
                reset()
                wait(6)
                forward()
                grab()
                forward()
                forward()
                extend()
                drop()
                forward()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                forward()
                grab()
                forward()
                forward()
                extend()
                reset()
                wait(2)
                forward()
                wait(3)
                forward()
                grab()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                reset()
                wait(1)
                forward()
                wait(3)
                forward()
                grab()
                forward()
                forward()
                extend()
                wait(1)
                back()
                back()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(11)
                grab()
                rotateCounterClockwise()
                wait(5)
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                wait(4)
                back()
                wait(4)
                grab()
                pivotClockwise()
                forward()
                reset()
            }
        }
        )
    }
}
