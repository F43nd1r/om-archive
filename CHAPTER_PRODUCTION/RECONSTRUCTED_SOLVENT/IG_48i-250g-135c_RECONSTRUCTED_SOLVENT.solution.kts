
solution {
    puzzle = "P084"
    name = "B ICX"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 5 to 5
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 4 to 4
        rotation = 0
        size = 3
    }
    arm(ARM6) {
        number = 3
        position = 5 to 3
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = 8 to 4
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = 7 to 0
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 9 to 4
        rotation = 2
    }
    glyph(BONDER) {
        position = 7 to 3
        rotation = 0
    }
    glyph(BONDER) {
        position = 10 to 2
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 6 to 5
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = 6 to 3
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = 8 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 7 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 5 to 2
        rotation = 0
    }
    track {
        position = 9 to 3
        positions = listOf(0 to 0, -1 to 1)
    }
    track {
        position = 4 to 3
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = 8 to 0
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(4)
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                rotateClockwise()
                wait(3)
                rotateCounterClockwise()
                rotateClockwise()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                rotateCounterClockwise()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                wait(1)
                extendTape()
            }
        }
        , 
        {
            sequence(5) {
                wait(12)
                grab()
                back()
                extend()
                retract()
                forward()
                wait(4)
                extend()
                retract()
                retract()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                back()
                reset()
            }
        }
        )
    }
}
